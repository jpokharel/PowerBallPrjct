package poweball.service;

import java.util.List;

import poweball.database.StringDatabase;

public class StringWriter {
	StringDatabase stringDatabase = new StringDatabase();

	public List<Integer> getPowerBallNumbers() {
		return stringDatabase.getPowerballNumbers();
	}
}
