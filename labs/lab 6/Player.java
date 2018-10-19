package area;

public class Player {
	String name;

	int goals;
	String team;

	public Player(String name, String team, int goals) {
		this.name = name;

		this.team = team;
		this.goals = goals;

	}

	public Player() {
		name = "";
		team = "";
		goals = 0;

	}

	public void setName(String str) {
		this.name = str;
	}

	public void setGoals(int goals) {
		this.goals = goals;
	}

	public void setTeam(String t) {
		this.team = t;
	}

	public String getTeam() {
		return this.team;
	}

	public String getName() {
		return this.name;
	}

	public int getGoals() {
		return this.goals;
	}

}
