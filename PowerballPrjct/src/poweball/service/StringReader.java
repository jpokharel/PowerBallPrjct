package poweball.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StringReader {
	public void readStringValues() throws IOException {
		int i = 0;
		FileReader fr = new FileReader("C:\\Users\\jiwanpokharel89\\Desktop\\PB.txt");
		BufferedReader br = new BufferedReader(fr);
		String value = "";
		StringParser stringParser = new StringParser();
		try {
			while ((value = br.readLine()) != null) {
				i++;
				if (i % 2 == 0)
					// System.out.println(value);
					stringParser.parseValues(value);
				value = br.readLine();
			}
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			fr.close();
			br.close();
		}
	}
}
