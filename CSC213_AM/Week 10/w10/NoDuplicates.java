package w10;

import java.io.*;
import java.util.*;

public class NoDuplicates {
		public static void main(String[] args) {
			//Start
			String sourceFile = "C:\\Users\\a7mor\\OneDrive\\Desktop\\currencies.txt";
			String targetFile = "C:\\Users\\a7mor\\OneDrive\\Desktop\\TARGET_FILE.txt";
			
			File srcFile = new File(sourceFile);
			File trgtFile = new File(targetFile);
			
			try {
				//Reading
				Set<String> myLines = new HashSet<String>();
				Scanner fileReader = new Scanner(srcFile);
				
				String line;
				while(fileReader.hasNext()) {
					line = fileReader.nextLine();
					myLines.add(line);
				}
				//Writing into target file
				FileWriter fw = new FileWriter(trgtFile);
				for(String l: myLines) {
					fw.write(l + "\n");
				}
				fw.close();
				
			} catch(FileNotFoundException fne) {
				System.out.println("File could not be found.");
			} catch(IOException ioe) {
				System.out.println(ioe.getMessage());
			}
			
			
		}

}
