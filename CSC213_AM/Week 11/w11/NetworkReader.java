package w11;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
public class NetworkReader {
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
		//Reading response from google
		byte b;
		while((b = (byte)in.read())!= -1) {
			System.out.println((char)b);
		}
	}

}
