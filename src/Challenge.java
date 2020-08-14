
public class Challenge {
	//ArrayList<Challenge> challenges
	String name;
	CodingSite Site;
	boolean solved;
	int difficulty;
	//ArrayList<Submission> submissions;
	public Challenge(CodingSite c,String name,boolean solved,int difficulty) {
		Site=c;
		this.name=name;
		this.solved=solved;
		this.difficulty=difficulty;
	}
	

}
