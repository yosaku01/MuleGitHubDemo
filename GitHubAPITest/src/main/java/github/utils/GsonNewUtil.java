package github.utils;

import java.lang.reflect.Type;
import java.util.LinkedList;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;

public class GsonNewUtil<T> 
{
	 public int getObjListFromResponse(String response)
	 {
	    	Gson gson = new Gson();
	    	try
	    	{
	    		Type listType = new TypeToken<LinkedList<T>>(){}.getType();
	        	LinkedList<T> list = gson.fromJson(response, listType);
	        	return list.size();
	    	}
	    	catch(JsonParseException ex)
	    	{
	    		ex.printStackTrace();
	    		return -1;
	    	}
	 }
	 
	 public T getObjectFromResponse(String repsonse, Class<T> cls)
	 {
		 Gson gson = new Gson(); 
		 T entity = null;
		 try
	     {			 
			 entity =  gson.fromJson(repsonse, cls);  
	     }
		 catch(JsonParseException ex)
	     {
			 ex.printStackTrace();	    	 
	     }
		 return entity;
	 }
}
