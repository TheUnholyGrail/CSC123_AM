//TURN IN
package w7;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		//Objectives: Copy text from one file onto another
		//String data = "Some info that needs to be inputted in a file";
		String sourceFile = "C:\\Users\\a7mor\\OneDrive\\Desktop\\SOURCE_FILE.txt";
		String targetFile = "C:\\Users\\a7mor\\OneDrive\\Desktop\\TARGET_FILE.txt";
		
		File srcFile = new File(sourceFile);
		File tfFile = new File(targetFile);
		
		try {
			//Reading
			//File stream for source
			FileInputStream in = new FileInputStream(srcFile);
			//File stream for target
			FileOutputStream out = new FileOutputStream(tfFile);
			
			//Read source file with set amount of bytes
			int available = in.available();
			byte[] buffer = new byte[available];
			in.read(buffer);
			//Writing into target file
			tfFile.createNewFile();
			out = new FileOutputStream(tfFile);
			
			out.write(buffer);
			out.flush();
		} catch(FileNotFoundException fne) {
			System.out.println("File could not be found.");
		} catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
	}

}
