package org.tcs.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONFileRead {
	
	public void readJSONFile() throws IOException, ParseException {
		// Read from Json file
		
		FileReader read = new FileReader("C:\\Users\\RAJAPPA\\Desktop\\Vanaja\\MavenProjects\\APITestingJSON\\JSONFiles\\Json1.json");
		
		JSONParser p = new JSONParser();
		Object object = p.parse(read);
		JSONObject j = (JSONObject) object;
		Object object2 = j.get("Sibilings");
		
		JSONArray a = (JSONArray) object2;
		Object object3 = a.get(0);
		System.out.println(a.get(0));
		
		JSONObject j1  = (JSONObject) object3;
		System.out.println(j1.get("Name"));
		System.out.println(j1.get("Address"));

	}

}
