package br.edu.cefsa.ftt.ec;

import java.net.*;
import java.io.*;

public class StocksApi {
	
	// https://iextrading.com/developer/
	
	public String getCompanyInfo(String companyCode) {

           String jsonMessage = "";
           
           try {
                 
        	  URL url = new URL("https://api.iextrading.com/1.0/stock/" + companyCode + "/company");

		      URLConnection stocksApi = url.openConnection();
		    
		        
		      BufferedReader data = new BufferedReader(
		                              new InputStreamReader(
		                              stocksApi.getInputStream()));
		      
		      jsonMessage = data.readLine();
		      	        
		      data.close();
		        
           } catch (Exception e) {
        	  System.err.println("Ops!!");
        	  e.printStackTrace();
           }
		
		
		return jsonMessage;
	}

}
