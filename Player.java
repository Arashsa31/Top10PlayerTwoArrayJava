
/**
 * @author Arash
 *
 */
public class Player {
	private String name;
	private double score;

	public Player() {

	}

	public Player(String name, double score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public double getScore() {
		return score;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setScore(double score) {
		this.score = score;
	}
}