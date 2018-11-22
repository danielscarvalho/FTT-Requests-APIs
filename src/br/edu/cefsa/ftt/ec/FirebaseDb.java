package br.edu.cefsa.ftt.ec;

import java.net.*;
import java.util.Date;
import java.util.Random;
import java.io.*;

public class FirebaseDb {
	
	public String getRegister(int num) {

           String register = "";
           
           try {
                 
        	  URL firebase = new URL("https://advfb-7e80b.firebaseio.com/peopleData/" + num + ".json");

		      URLConnection fb = firebase.openConnection();
		    
		        
		      BufferedReader in = new BufferedReader(
		                              new InputStreamReader(
		                              fb.getInputStream()));
		      
		      register = in.readLine();
		        
		      in.close();
		        
           } catch (Exception e) {
        	  System.err.println("Ops!!");
        	  e.printStackTrace();
           }
		
		
		return register;
	}

	public String postRegister(String info) {
		
		Random rn = new Random();
		
		String rawData = "{id=" + (1000 + rn.nextInt()) + 
				         ",day=\"" + new Date() + "\"" +
				         ",info=\"" + info + "\"" +
				         ",value=" + (rn.nextFloat()*1000) + "}";
		
		try {
			
			String type = "application/json";
			String encodedData = URLEncoder.encode( rawData, "UTF-8" ); 
			
			URL u = new URL("https://advfb-7e80b.firebaseio.com/info");
			HttpURLConnection conn = (HttpURLConnection) u.openConnection();
			
			conn.setDoOutput(true);
			
			conn.setRequestMethod("POST");
			conn.setRequestProperty( "Content-Type", type );
			conn.setRequestProperty( "Content-Length", String.valueOf(encodedData.length()));
			
			OutputStream os = conn.getOutputStream();
			
			os.write(encodedData.getBytes());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rawData;
	}
	
}
