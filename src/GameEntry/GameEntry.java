package GameEntry;

public class GameEntry {
	
	protected String name;	//name of the person earning scores
	protected int score;	//the score value
	
	//Constructor for GameEntry
	public GameEntry(String n, int s) {
		name = n;
		score = s;
	}
	//Retrieve name field
	public String getName() { return name; }
	public int getScore() { return score; }
	
	//Return a string to represent this entry
	public String toString() {
		return "( " +name+ ", "+score+ " )";
	}
}
