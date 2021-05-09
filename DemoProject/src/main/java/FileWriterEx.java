import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) throws IOException {
		String loc=System.getProperty("user.dir")+
				"/UsingBufferedWriter.txt";
		String Content="Hello";
		
		FileWriter filewriter=new FileWriter(loc);
		BufferedWriter write=new BufferedWriter(filewriter);
		write.write(Content);
		write.newLine();
		write.write("HI");
		write.newLine();
		write.write("Pgm");
		write.close();
		write.newLine();
		readfileEx();
		
	}
	
	public static void readfileEx() throws IOException {
		String location=System.getProperty("user.dir")+"/UsingBufferedWriter.txt";
		
		FileReader reader=new FileReader(location);
		
		BufferedReader read=new BufferedReader(reader);
		
		String LineFirst=read.readLine();
		//System.out.println(LineFirst);
		
		while((LineFirst=read.readLine())!=null) {
			System.out.println(LineFirst);
			
		}
	}
	
}
