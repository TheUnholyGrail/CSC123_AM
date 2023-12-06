package w11;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.io.Reader;
public class NetworkReader2 {
	//output stream to send and input to read
	public static void main(String[] args) throws Exception
	{
		Socket client = new Socket("www.google.com", 80);
		
		InputStream in = client.getInputStream();	//Read request
		OutputStream out = client.getOutputStream();	//Send request
		//My request
		String request = "Get / \r\n";
		//Sending to google
		out.write(request.getBytes());
		//Reformatting io
		BufferedInputStream bin = new BufferedInputStream(in);
		//Will read all lines at once
		Reader r = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(r);
		
		String line;
		while((line = br.readLine())!=null) {
			System.out.println(line);
			
		}
		
		//byte[] bytes = bin.readAllBytes();
		//Convert bytes to string
		//String s = new String(bytes);
		
		
	}

}
