package br.edu.cefsa.ftt.ec;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class DuckDuckGo {

	// http://duckduckgo.com/api
	
	public String getQuery(String query) {

        String ddgJson = "";
        
        try {
              
     	  URL ddgApi = new URL("https://api.duckduckgo.com/?format=json&pretty=1&q=" + URLEncoder.encode(query, "UTF-8"));

		      //URLConnection ddgConnection = ddgApi.openConnection();
   
     	      URLConnection ddgConnection = ddgApi.openConnection();
	
     	  	  ddgConnection.setConnectTimeout(5000);
          	  ddgConnection.setReadTimeout(5000);
     	      
     	      ddgConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		      ddgConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows; U; Windows NT 6.1; en-GB;     rv:1.9.2.13) Gecko/20101203 Firefox/3.6.13 (.NET CLR 3.5.30729)");
		      
		      BufferedReader in = new BufferedReader(
		                              new InputStreamReader(
		                              ddgConnection.getInputStream()));
		      
		      ddgJson = in.readLine();
		        
		      in.close();
		        
        } catch (Exception e) {
     	  System.err.println("Ops!!");
     	  e.printStackTrace();
        }
			
		return ddgJson;
	}
	
}
