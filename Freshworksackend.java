import java.io.*;
import java.lang.String;
import java.util.*;
import org.json.JSONObject; 
class tr extends Thread
{ int i;
  public void run()
  {  try{ for(i=0;i<2;i++)
	  {Thread.sleep(200);}
	} catch(Exeption e){} 
  }
}
public class Data 
{
 static BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
 public void Insert( ) throws IOException
 {
   Scanner in = new Scanner (System.in);
   System.out.println("Enter the ID_Name: ");
	String ID_Name=in.next();
	System.out.println("Enter the Country: ");
	String country=in.next();
	System.out.println("Enter the region: ");
	char  region=in.nextInt();
	System.out.println("Enter the language: ");
	char language=in.nextInt();     
  JSONObject obj=new JSONObject(); 
  obj.put("ID_name",ID_Name);    
  obj.put("country",country);    
  obj.put("region",region);
  obj.put("language",language);
  PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("Data.txt",true)));
  pw.print(obj);
  System.out.println("Details added successfully.");
  pw.close();
 }

public static void main(String args[]) throws IOException
{
  Data in = new Data();
  in.Insert();
 tr t1=new tr();
 t1.start();
  
}}