package area;

public class Goal {
	int minute;
	String player;

	public Goal(String player, int minute) {
		this.minute = minute;
		this.player = player;

	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getMinute() {
		return this.minute;

	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public String getPlayer() {
		return this.player;

	}

}
