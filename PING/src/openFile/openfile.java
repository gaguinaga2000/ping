//import java.awt.Desktop;
package openFile;

import java.io.*;

//import java.lang.*;
public class openfile {
		// TODO Auto-generated method stub
		 public static void main(String[] args) throws IOException {
		        //text file, should be opening in default text editor
			  try {
	                Runtime rt = Runtime.getRuntime();
	                
	                rt.exec("taskkill /F /IM C:\\Program Files\\Wireshark\\Wireshark.exe");
	          //  String command = "cmd /c Wireshark.lnk -i Wi-Fi -k";
	                
	          String command = "cmd /c cd c:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs & Wireshark.lnk -i Wi-Fi -k";
	               // String command = "c:\\Program Files\\Wireshark\\Wireshark.exe";
	                
	           // String command = "cmd /c dir";
	                Process pr = rt.exec(command);
	                //Process pr = rt.exec("c:\\helloworld.exe");
	               // System.out.println(command);
	           //   BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));
	 
	            //  String line=null;
	 
//	             while((line=input.readLine()) != null) {
//	               System.out.println(line);
//	               }
	 
	               // int exitVal = pr.waitFor();
	              //  pr.destroy();
	              //  System.out.println("Exited with error code "+exitVal);
	 
	            } catch(Exception e) {
	            	
	                System.out.println("error");
	               // System.out.println(e.toString());
	                e.printStackTrace();
	            }
	        }
}

