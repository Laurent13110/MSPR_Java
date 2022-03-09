package text.java;
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
    // ouvre la liste des equiment 
    manager.openFile("text/liste.txt");
    // lis la fiche agent  
    BufferedReader obj = new BufferedReader (manager.getReader());
    String name = obj.readLine();  
    //retourne la fiche agent 
    return value;
  }
  //fontion pour ajouté un equiment a un agent 
  public static String addItem(String typeEquip, String nomAgent) throws IOException 
  {
    FileManager manager = new FileManager();
    BufferedReader obj = new BufferedReader (manager.getReader());
    String strng = obj.readLine();  
    // boucle pour trouvé le nom de l'equiment a rajouté 
    while (strng == typeEquip)
    {
      System.out.println(strng);
      strng = obj.readLine();
    }
    // ouverture de la fiche agent demandé 
    manager.openFile(nomAgent);
    //ecrit a la fin du ficher le nouvelle equi^pement 
    manager.write(strng,nomAgent);
    return strng;
  }
}