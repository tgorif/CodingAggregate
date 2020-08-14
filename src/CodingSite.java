import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public interface CodingSite {
	String name=null;
	URL loginPage=null;
	URL url=null;
	int numSolved=0;
	int numTotal=0;
	int acceptedEasy=0;
	int acceptedMedium=0;
	int acceptedHard=0;
	String userName=null;
	ArrayList<Challenge> challenges=null;
	public void extractSubmissionsFromFile() throws IOException, ParseException;
	public void getSolvedChallenges();
}
