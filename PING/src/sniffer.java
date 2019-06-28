import java.io.*;
import java.net.*;
import openFile.*;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class sniffer
{
  public static void main(String[] args)
  
  
  throws Exception
  {
    new sniffer(args);
  }
  
  public sniffer(String[] args)
  {
	  
    try
    {
        
    	System.out.print("Enter url: http://");
    	
    	BufferedReader reader =  
                new BufferedReader(new InputStreamReader(System.in)); 
    	
    	String myUrl = reader.readLine(); 
    	 myUrl = "http://" + myUrl;
    	 
    //calls file from another package/class/java file
    

       //TimeUnit.SECONDS.sleep(10);
      String results = doHttpUrlConnectionAction(myUrl, args);
      System.out.println(results);
      
      //System.out.println("after sleep\n");
    }
    catch (Exception e)
    {
      // deal with the exception in your "controller"
    }
  }

  private String doHttpUrlConnectionAction(String desiredUrl, String[] args)
  throws Exception
  {
	  BufferedReader reader =  
              new BufferedReader(new InputStreamReader(System.in)); 
    URL url = null;
    
    Scanner in = new Scanner(System.in);
   
    try
    {
      // create the HttpURLConnection
      url = new URL(desiredUrl);
      HttpURLConnection connection = (HttpURLConnection) url.openConnection();
     
      connection.setReadTimeout(15*1000);
      
	  openfile.main(args);
	  TimeUnit.SECONDS.sleep(15);
      connection.connect();
   
      if(connection != null)
      {
    	  System.out.println("Connection established\n");
    	  System.out.print("Disconnect? (y)");
    	  String close = reader.readLine(); 
    	 System.out.println(close);
    	
         connection.disconnect();
    	  //TimeUnit.SECONDS.sleep(2);
         System.out.println("Connection terminated.");
         char goAgain;
         System.out.print("\nSniff again? (y)");
         goAgain = in.next().charAt(0);
         
         //System.out.println(goAgain);
         if(goAgain != 'y' && goAgain != 'Y') {
        	 return "Bye";
         }
         
     
         do {
    	 
    	      System.out.print("Enter url: http://");
         	  String  myUrl = reader.readLine(); 
        	
	    	  myUrl = "http://" + myUrl;
	    	  url = new URL(desiredUrl);
	        	   
		      connection = (HttpURLConnection) url.openConnection();
		     
		      connection.setReadTimeout(15*1000);
		      connection.connect();
		      
		      System.out.print("Disconnect? (y)");
		       close = reader.readLine(); 
		       
		       connection.disconnect();
		      
		      System.out.print("\nSniff again? (y)");
	          goAgain = in.next().charAt(0);
         }while(goAgain == 'y' || goAgain == 'Y');
         
         
    	// System.exit(0);
    	// System.out.println("not working");
      }
         return "Couldn't connect";
    }
    catch (Exception e)
    {
      e.printStackTrace();
      throw e;
    }
    
  }
}