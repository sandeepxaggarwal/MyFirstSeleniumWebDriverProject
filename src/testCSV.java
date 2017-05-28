import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;


public class testCSV {

	public static void main(String[] args) throws IOException {
		Reader fis = new FileReader("C:\\Softwares\\Training\\test.csv");
		CSVReader reader = new CSVReader(fis);
		
		List<String[]> list = reader.readAll();
		Iterator<String[]> iterate = list.iterator();
		
		while(iterate.hasNext()){
			String[] s = iterate.next();
			
			for(int i=0;i<s.length;i++){
				System.out.println(s[i]);
			}
		}
		
		
		

	}

}
