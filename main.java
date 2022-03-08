import java.io.*;
import java.util.*;

public class Main
{
  public static void main(String[] args) throws IOException
  {
      
  }

  public static String getItem(String fileName) throws IOException
  {
    String value = null;
    FileManager manager = new FileManager();
    manager.openFile("text/liste.txt");
    BufferedReader obj = new BufferedReader (manager.getReader());
    String name = obj.readLine();  
    return value;
  }

  public static String addItem(String typeEquip, String nomAgent) throws IOException 
  {
   
    FileManager manager = new FileManager();
    BufferedReader obj = new BufferedReader (manager.getReader());
    String strng = obj.readLine();  

    while (strng == typeEquip)
    {
      System.out.println(strng);
      strng = obj.readLine();
    }
   
    manager.openFile(nomAgent);
    manager.write(strng,nomAgent);
    return strng;
  }

}