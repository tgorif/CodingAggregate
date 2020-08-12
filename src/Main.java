import java.io.IOException;
import java.net.URL;

import org.json.simple.parser.ParseException;

public class Main {

	public static void main(String[] args) throws IOException, ParseException {
		CodingSite leetcode = new CodingSite("leetcode",new URL("https://leetcode.com/api/problems/algorithms/"),new URL("https://leetcode.com/"));
		leetcode.extractSubmissions();
		leetcode.getSolvedChallenges();
		// TODO Auto-generated method stub

	}

}
