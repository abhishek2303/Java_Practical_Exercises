import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

public class PE4 {
    public static void main(String [] args) throws IOException {
	File f = new File("file.txt");
	FileReader fr = new FileReader(f);
	BufferedReader br = new BufferedReader(fr);
	String fileContent = "";

	System.out.println(br.readLine().toUpperCase());
	
	
    }

}
