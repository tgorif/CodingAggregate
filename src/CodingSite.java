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

public class CodingSite {
	String name;
	URL loginPage;
	URL url;
	int numSolved;
	int numTotal;
	int acceptedEasy;
	int acceptedMedium;
	int acceptedHard;
	String userName;
	ArrayList<Challenge> challenges;
	
	public CodingSite(String name,URL url,URL loginPage) {
		this.loginPage =loginPage;
		this.name = name;
		this.url = url;
		challenges =new ArrayList<Challenge>();
	}
	public void extractSubmissions() throws IOException, ParseException {
		Object obj = new JSONParser().parse(new FileReader("H:\\workspace\\eclipse-workspace\\CodingAggregate\\src\\Leetcode.json"));
		JSONObject jsonobj = (JSONObject)obj;
		long numsol = (long) jsonobj.get("num_solved");
		numSolved = (int)numsol;
		long ae = (long) jsonobj.get("num_solved");
		acceptedEasy=(int)ae;
		long am = (long) jsonobj.get("num_solved");
		acceptedMedium =(int)am;
		long ah = (long) jsonobj.get("num_solved");
		acceptedHard=(int)ah;
		userName =(String)jsonobj.get("user_name");
		long numt = (long)jsonobj.get("num_total");
		numTotal=(int)numt;
		JSONArray jsonarr =(JSONArray)jsonobj.get("stat_status_pairs");
		Iterator it = jsonarr.iterator();
		while(it.hasNext()) {
			JSONObject o = (JSONObject) it.next();
			JSONObject inner =(JSONObject) o.get("stat");
			boolean b=true;
			String t = (String)o.get("status");
			if(t==null) {
				b=false;
			}
			Challenge c = new Challenge(this,(String)inner.get("question__title"),b);
			challenges.add(c);
		}
	}
	public void getSolvedChallenges() {
		for(Challenge c : challenges) {
			if(c.solved) {
				System.out.println(c.name);
			}
		}
	}
}
