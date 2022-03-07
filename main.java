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

  public static String RecupItem(String typeEquip) throws IOException 
  {
    // Création d’un fileReader pour lire le fichier
    FileReader fileReader = new FileReader("text/liste.txt");

    // Création d’un bufferedReader qui utilise le fileReader 
    BufferedReader obj = new BufferedReader (fileReader);

    String strng =strng = obj.readLine();  
    while (strng == typeEquip)
    {
      System.out.println(strng);
      strng = obj.readLine();
    }
    return strng;
  }

}