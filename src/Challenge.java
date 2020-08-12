
public class Challenge {
	//ArrayList<Challenge> challenges
	String name;
	CodingSite Site;
	boolean solved;
	//ArrayList<Submission> submissions;
	public Challenge(CodingSite c,String name,boolean solved) {
		Site=c;
		this.name=name;
		this.solved=solved;
	}
	

}
