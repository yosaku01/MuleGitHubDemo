package github.utils;

import java.lang.reflect.Type;
import java.util.LinkedList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;

public class GsonNewUtil<T> 	
{
	 public LinkedList<T> getObjListFromResponse(String response, Type listType)
	 {
		 	Gson gson = new GsonBuilder()
		 			.setPrettyPrinting() 
		 			.create();
	    	try
	    	{	    		
	        	LinkedList<T> list = gson.fromJson(response, listType);
	        	return list;
	    	}
	    	catch(JsonParseException ex)
	    	{
	    		ex.printStackTrace();
	    		return null;
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
