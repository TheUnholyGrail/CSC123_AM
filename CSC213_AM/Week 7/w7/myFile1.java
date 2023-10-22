package w7;
import java.io.File;

public class myFile1 {

	public static void main(String[] args) {
		//Start
		File myFile = new File("C:/Users/a7mor/OneDrive/Desktop/a7.txt");
		System.out.println(myFile.exists());
		System.out.println(myFile.canRead());
		System.out.println(myFile.canWrite());
		System.out.println(myFile.canExecute());
		System.out.println(myFile.isDirectory());
		
		File[] files = myFile.listFiles();
		for(File f: files) {
			System.out.println("Deleting..." + f.getName());
			f.delete();
		}
		
	}

}
