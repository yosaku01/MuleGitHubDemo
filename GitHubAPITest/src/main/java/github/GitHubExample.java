package github;

import java.util.Scanner;

import org.scribe.builder.ServiceBuilder;
import github.api.GitHubApi;

import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.model.Verifier;
import org.scribe.oauth.OAuthService;

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
		        .callback("http://www.sot-soft.com")
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
		    //String code = getCode(authorizationUrl);
		    
		    
		    nextLine = in.nextLine();		  		   
		    Verifier verifier = new Verifier(nextLine);
		    System.out.println();

		    // Trade the Request Token and Verifier for the Access Token
		    System.out.println("Trading the Request Token for an Access Token...");		    
		    Token accessToken = service.getAccessToken(EMPTY_TOKEN, verifier);
		    System.out.println("Got the Access Token!");
		    System.out.println("(if your curious it looks like this: " + accessToken + " )");
		    System.out.println();
		    
		    System.out.println();
		    System.out.println("Thats it man! Go and build something awesome with Scribe! :)");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}	
    }
    
    /*private static String getCode(String authorizationUrl)
	{
		String code = "";
		
		OAuthRequest request = new OAuthRequest(Verb.GET, authorizationUrl);
		 
		Response response = request.send();
		String body = response.getBody();
		return code;
	}*/
}
