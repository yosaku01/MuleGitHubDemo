package github;

import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.Scanner;

import org.scribe.builder.ServiceBuilder;
import github.api.GitHubApi;
import github.entity.RepositoryCommit;
import github.utils.GsonNewUtil;

import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.model.Verifier;
import org.scribe.oauth.OAuthService;

import com.google.gson.reflect.TypeToken;


/**
 * Hello world!
 *
 */
public class GitHubExample 
{
	private static final Token EMPTY_TOKEN = null;
    public static void main( String[] args )
    {
    	try
		{
			// Replace these with your own api key and secret
		    String apiKey = "d634041b0d6f304728c3";
		    String apiSecret = "778cf996114008dc1c043088a45342acc4a13285";
		    OAuthService service = new ServiceBuilder().provider(GitHubApi.class)
		        .apiKey(apiKey)
		        .apiSecret(apiSecret)
		        .callback("http://localhost:8082")
		        .build();
		    Scanner in = new Scanner(System.in);
		    
		    // Obtain the Authorization URL
		    System.out.println("Fetching the Authorization URL...");
		    String authorizationUrl = service.getAuthorizationUrl(EMPTY_TOKEN);
		    System.out.println("Got the Authorization URL!");
		    System.out.println("Now go and authorize Scribe here:");
		    System.out.println(authorizationUrl);
		    System.out.println("And paste the authorization code here");
		    System.out.print(">>");	
		    String nextLine = "";	
		    
		    nextLine = in.nextLine();		  		   
		    Verifier verifier = new Verifier(nextLine);
		    System.out.println();

		    // Trade the Request Token and Verifier for the Access Token
		    System.out.println("Trading the Request Token for an Access Token...");		    
		    Token accessToken = service.getAccessToken(EMPTY_TOKEN, verifier);
		    System.out.println("Got the Access Token!");
		    System.out.println("(if your curious it looks like this: " + accessToken + " )");
		    System.out.println();
		    
		    OAuthRequest request1 = new OAuthRequest(Verb.GET, "https://api.github.com/repos/yosaku01/MuleGitHubDemo/commits");
		    service.signRequest(accessToken, request1); // the access token from step 4		    
		    Response response1  = request1.send();
		    GsonNewUtil<RepositoryCommit> util1 = new GsonNewUtil<RepositoryCommit>();
		    Type listType = new TypeToken<LinkedList<RepositoryCommit>>(){}.getType();
		    LinkedList<RepositoryCommit> gistList = util1.getObjListFromResponse(response1.getBody(), listType);
		    
		    System.out.println("gist list count is:" + gistList.size());
		       
		    System.out.println("Thats it man! Go and build something awesome with Scribe! :)");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}	
    }
}
