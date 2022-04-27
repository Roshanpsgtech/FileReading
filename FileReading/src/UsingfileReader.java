import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UsingfileReader {

	public static void main(String[] args) throws IOException {
		
		//1.file 2.location
	String filelocation ="C:\\Users\\roshan\\eclipse-workspace\\UsingFileWriter\\Bufferwriter.txt";
	
	FileReader fr = new FileReader(filelocation);
	
	//use buffered Reader
	BufferedReader reader=new BufferedReader(fr);
	String result;
	while((result=reader.readLine())!=null)
	{
		System.out.println(result);
	}
	
	}

}
