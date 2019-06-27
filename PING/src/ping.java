import java.io.*;
import java.net.*;

public class ping {
		  // Sends ping request to a provided IP address 
		  public static void sendPingRequest(String ipAddress) 
		              throws UnknownHostException, IOException 
		  { 
		    InetAddress geek = InetAddress.getByName(ipAddress); 
		    System.out.println("Sending Ping Request to " + ipAddress); 
		    if (geek.isReachable(5000)) 
		      System.out.println("Host is reachable"); 
		    else
		      System.out.println("Sorry ! We can't reach to this host"); 
		  } 
		  
		  // Driver code 
		  public static void main(String[] args) 
		          throws UnknownHostException, IOException 
		  { 
		    String ipAddress = "216.58.193.142"; 
		    sendPingRequest(ipAddress); 
		    
//		    ipAddress = "127.0.0.1"; 
//		    sendPingRequest(ipAddress); 
//		  
//		  
//		    ipAddress = "172.217.9.142"; 
//		    sendPingRequest(ipAddress); 
//		  
//		    ipAddress = "162.250.126.19"; 
//		    sendPingRequest(ipAddress); 
		  } 

}
