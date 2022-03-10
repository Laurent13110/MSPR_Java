package text.java;
import java.io.*;
//creaztion de la classe  qui perme la gestion des fichier 
public class FileManager {
    private FileReader reader;

    public FileManager() {
    }
    //fontion, de verification d'existance du dosser 
    public boolean fileExists(String fileName) {
        return new File("listAgent/" + fileName + ".txt").exists();
    }
    // fontion d'ouverture 
    public void openFile(String fileName) throws FileNotFoundException {
        String fullName = fileName;
        if (fileExists(fullName)) {
            this.reader = new FileReader(fullName);
        }

    }

    public FileReader getReader(){
        return reader;
    }
    // fontion d'ecriture
    public void write(String Iteme , String nomAgent) throws IOException {
        FileWriter fw = new FileWriter(manager.getReader());
      fw.write(Iteme);
    }

  

}