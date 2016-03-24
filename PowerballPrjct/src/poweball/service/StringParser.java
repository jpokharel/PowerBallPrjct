package poweball.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import poweball.database.StringDatabase;
import poweball.model.StringModel;

public class StringParser {
	private List<StringModel> stringModels = StringDatabase.getStringModel();

	public void parseValues(String str) {
		String strValue = str;
		String[] strValues = strValue.split("\t");
		
		SimpleDateFormat formatter = new SimpleDateFormat("mm/dd/yyyy");
		StringDatabase stringDatabase = new StringDatabase();
		try {
			StringModel stringModel=stringModels.add(stringModel.getDateOfDraw().);
		} catch (ParseException e) {
			System.out.println("Error with date: " + e);
		}
		
		stringDatabase.getNormalNumbers().add(Integer.parseInt(strValues[1]));
		stringDatabase.getNormalNumbers().add(Integer.parseInt(strValues[2]));
		stringDatabase.getNormalNumbers().add(Integer.parseInt(strValues[3]));
		stringDatabase.getNormalNumbers().add(Integer.parseInt(strValues[4]));
		stringDatabase.getNormalNumbers().add(Integer.parseInt(strValues[5]));
		
		
		stringDatabase.getPowerballNumbers().add(Integer.parseInt(strValues[6]));
		

	}
}
