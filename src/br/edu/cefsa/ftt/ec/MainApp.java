package br.edu.cefsa.ftt.ec;

// https://github.com/toddmotto/public-apis

public class MainApp {

	public static void main(String[] args) {

	   FirebaseDb fbdb = new FirebaseDb();
       System.out.println(fbdb.getRegister(0));
       //System.out.println(fbdb.postRegister("Heloww!!"));
       
       //StocksApi = new StocksApi();
       //aapl, orcl, ibm, abb
       //System.out.println(sApi.getCompanyInfo("aapl"));
       
       //DuckDuckGo ddg = new DuckDuckGo();
       //System.out.println(ddg.getQuery("Sonia Braga"));
       

       
	}

}
