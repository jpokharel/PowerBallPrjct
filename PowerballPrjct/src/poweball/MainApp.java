package poweball;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import poweball.service.StringReader;
import poweball.service.StringWriter;

public class MainApp {

	public static void main(String[] args) throws IOException {
		StringReader stringReader = new StringReader();
		StringWriter stringWriter = new StringWriter();

		stringReader.readStringValues();
		List<Integer> powerBall=new ArrayList<Integer>();
		
		powerBall=stringWriter.getPowerBallNumbers();
		Iterator<Integer> it= powerBall.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}
