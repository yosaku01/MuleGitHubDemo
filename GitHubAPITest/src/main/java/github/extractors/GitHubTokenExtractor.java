package github.extractors;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.scribe.exceptions.OAuthException;
import org.scribe.extractors.AccessTokenExtractor;
import org.scribe.model.Token;
import org.scribe.utils.Preconditions;

public class GitHubTokenExtractor implements AccessTokenExtractor
{
	  public Token extract(String response)
	  {
	    Preconditions.checkEmptyString(response, "Cannot extract a token from a null or empty String");
	    int index = response.indexOf("access_token=");
	    if(index == 0)
	    {
	      int splitIndex = response.indexOf("&");
	      String accessToken = response.substring(13, splitIndex);
	      return new Token(accessToken, "", response);
	    }
	    else
	    {      
	      throw new OAuthException("Cannot extract an acces token. Response was: " + response);
	    }
	  }
}
