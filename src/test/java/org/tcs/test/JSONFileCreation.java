package org.tcs.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

public class JSONFileCreation extends JSONFileRead {
	
	public void createJSonFile() throws IOException {
		// creating new JSON file
		
		JSONObject j = new JSONObject();
		j.put("Name", "Vanaja");
		j.put("Address", "Tenkasi");
		j.put("Phone number", 7639665323l);
		
		JSONObject sib = new JSONObject();
		sib.put("Name", "Priya");
		sib.put("Address", "Chennai");
		sib.put("Phone number", 9894866321l);
		
		
		JSONObject sib1 = new JSONObject();
		sib1.put("Name", "Priya");
		sib1.put("Address", "Chennai");
		sib1.put("Phone number", 9894866321l);
		
		JSONArray a =new JSONArray();
		a.add(sib);
		a.add(sib1);
		j.put("Sibilings", a);
		
		
		
		System.out.println(j);
		
		@SuppressWarnings("resource")
		FileWriter writer = new FileWriter("C:\\Users\\RAJAPPA\\Desktop\\Vanaja\\MavenProjects\\APITestingJSON\\JSONFiles\\Json1.json");
		writer.write(j.toJSONString());
		writer.flush();
	}
	
	public static void main(String[] args) throws IOException, ParseException {
		JSONFileCreation jsonFileCreation = new JSONFileCreation();
		//jsonFileCreation.createJSonFile();
		jsonFileCreation.readJSONFile();
		
		
	}

}
