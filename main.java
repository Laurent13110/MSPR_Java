import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.nio.file.*;


public class main 
{
    /**
    * @param args
     * @throws IOException
    */
    public static void main(String[] args) throws IOException
    {
        List<String> ficheAgent;
        List<String> staffs = new ArrayList<>();
      //  Path chemin = Paths.get("intro.txt");
        File doc = new File("text/liste.txt");

        BufferedReader obj = new BufferedReader(new FileReader(doc));

        String strng;
        while ((strng = obj.readLine()) != null)
        System.out.println(strng);
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