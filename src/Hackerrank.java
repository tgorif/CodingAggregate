import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class Hackerrank implements CodingSite {
	private final String USER_AGENT = "Mozilla/5.0";
	String name=null;
	URL loginPage=null;
	URL url=null;
	int numSolved=0;
	int numTotal=0;
	int acceptedEasy=0;
	int acceptedMedium=0;
	int acceptedHard=0;
	String userName=null;
	private HttpURLConnection con;
	ArrayList<Challenge> challenges=null;
	public Hackerrank(String name,URL url,String username) throws MalformedURLException{
	this.name=name;
	this.url=url;
	challenges = new ArrayList<>();
	this.userName=username;
	this.loginPage= new URL(this.url.toString()+"/"+ username);
	System.out.println(loginPage.toString());
	}
	public void extractSubmissionsFromFile() throws IOException, ParseException{
		Document doc=Jsoup.connect(url.toString()).maxBodySize(0).get();
		Elements all = doc.getElementsByClass("section-card-content");
		System.out.println(all.size());
		for(Element e : all) {
			System.out.println(e.className() + " " + e.nodeName() + " " + e.tagName() + " " +e.normalName() + " " + e.childrenSize());
		}	
	}
	public String getPageContent(URL url) throws IOException {
		URL obj = new URL(url.toString());
		con= (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("GET");
		con.setUseCaches(false);
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Accept",
			"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
		BufferedReader in =
	            new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		return response.toString();
}
	public void getSolvedChallenges() {
		System.out.println("Not Implemented");
	}

}
