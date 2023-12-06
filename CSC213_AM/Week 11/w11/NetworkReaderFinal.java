package w11;
//imports
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class NetworkReaderFinal {
	static Map<String, Currency> worldCurrencies = new TreeMap<String, Currency>();
	public static void main(String[] args) throws Exception
	{
		Socket client=new Socket("www.usman.cloud",80);
		//Map
		//ArrayList<Currency> worldCurrencies = new ArrayList<Currency>();
		
		
		
		
		
		
		
		OutputStream out=client.getOutputStream();
		InputStream in=client.getInputStream();

		//Sending reqeust to Google
		String request="GET /exchange-rate.csv \r\n";
		out.write(request.getBytes());
		//This will read all bytes at once

		Reader r=new InputStreamReader(in);
		BufferedReader br=new BufferedReader(r);

		String line;
		while((line=br.readLine())!=null) {
			
			String[] currencyLine=line.split(",");
			//Puts organized stuff into array list
			Currency c = new Currency(currencyLine[0],currencyLine[1], Double.parseDouble(currencyLine[2]));
			worldCurrencies.put(c.getCountryCode(), c);
			
		}
		//List with world currencies obtained
		System.out.println(worldCurrencies.get("GBP"));
		
	}

}
