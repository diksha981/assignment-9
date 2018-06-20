package assignment;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class ReadingFiles {

	public static void wri() throws IOException {
		File file1 = new File("C:\\Users\\abc\\eclipse-workspace\\assignment-9\\src\\abc.txt");
		File file2 = new File("C:\\Users\\abc\\eclipse-workspace\\assignment-9\\src\\xyz.txt");
		
		
		FileInputStream fin = new FileInputStream(file1);
		FileOutputStream fout = new FileOutputStream(file2);
		
		
		
		try {
			int a;
			while((a=fin.read()) != -1) {
				fout.write((char)a);
				
			}
		}
		
		catch(Exception e) {
			System.out.println("Excpetion Occured");
		}
		
		
		finally {
			fin.close();
			fout.close();
		}
		
		
		FileReader fr = new FileReader(file2);
		int b;
		while((b = fr.read()) != -1) {
			System.out.print((char)b);
		}
		
		fr.close();
	}
	
	public static void main(String[] args) throws IOException {
		
		wri();
		
	}

}