import java.io.IOException;
import java.net.URL;

import org.json.simple.parser.ParseException;

public class Main {

	public static void main(String[] args) throws IOException, ParseException {
		CodingSite leetcode = new Leetcode("leetcode",new URL("https://leetcode.com/api/problems/algorithms/"),new URL("https://leetcode.com/"));
		leetcode.extractSubmissionsFromFile();
		CodingSite hackerrank= new Hackerrank("Hackerrank",new URL("https://www.hackerrank.com/tgorif?hr_r=1"),"tgorif");
		hackerrank.extractSubmissionsFromFile();
		// TODO Auto-generated method stub

	}

}
