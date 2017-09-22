import java.util.Collections;
import java.io.File;
import java.io.FileInputStream;
import java.io.ByteArrayInputStream;

class PE9 {

    public static void main(String[] args) {
	String extension = args[1];
	File f = new File("file.txt");

	try(
	    ByteArrayInputStream in = new ByteArrayInputStream(f);
	    ) {
	    int c;
	    while((c = in.read()) != -1) System.out.println(c + " ");
	} catch (Exception e) {
	    System.out.println(e);
	}
	
    }

}
