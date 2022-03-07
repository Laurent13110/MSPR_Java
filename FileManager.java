import java.io.*;

public class FileManager {
    private FileReader reader;

    public FileManager() {
    }

    public boolean fileExists(String fileName) {
        return new File("listAgent/" + fileName + ".txt").exists();
    }

    public void openFile(String fileName) throws FileNotFoundException {
        String fullName = fileName;
        if (fileExists(fullName)) {
            this.reader = new FileReader(fullName);
        }

    }

    public FileReader getReader(){
        return reader;
    }

}