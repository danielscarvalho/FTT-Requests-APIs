package br.edu.cefsa.ftt.ec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;

public class SimpleApiCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			//URL url = new URL("http://www.ibm.com");
			//URL url = new URL("https://www.wikipedia.org");
			URL url = new URL("https://advfb-7e80b.firebaseio.com/peopleData/1.json");
			
			URLConnection connection = url.openConnection();
			        
			connection.setReadTimeout(5000);
			connection.setConnectTimeout(5000);
			        
			BufferedReader in = new BufferedReader(
			                           new InputStreamReader(
			                           connection.getInputStream()));
			        
			String inputLine;

			while ((inputLine = in.readLine()) != null) 
				System.out.println(inputLine);
			        
			in.close();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //try
		
	} //main

} //SimpleApiCall
