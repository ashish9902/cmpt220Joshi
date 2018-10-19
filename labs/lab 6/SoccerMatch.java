package area;

import java.util.Arrays;
import java.util.Date;

public class SoccerMatch {
	Date startTime;
	Date endTime;
	String location;
	String home;
	Player[] homePlayers = new Player[11];
	Player[] visitorsPlayers = new Player[11];
	Goal[] homeGoals = new Goal[10];
	Goal[] visitorGoals = new Goal[10];

	public void addHomePlayer(Player p) {
		this.homePlayers = homePlayers;

	}

	public void addVisitorPlayer(Player p) {
		this.visitorsPlayers = visitorsPlayers;

	}

	public void addHomeGoal(Goal g) {
		this.homeGoals = homeGoals;

	}

	public void addVisitorGoal(Goal g) {
		this.visitorGoals = visitorGoals;
	}

	public Goal[] getHomeGoals() {

		return homeGoals;

	}

	public SoccerMatch(Date startTime, Date endTime, String location, String home, Player[] homePlayers,
			Player[] visitorsPlayers, Goal[] homeGoals, Goal[] visitorGoals) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
		this.location = location;
		this.home = home;
		this.homePlayers = homePlayers;
		this.visitorsPlayers = visitorsPlayers;
		this.homeGoals = homeGoals;
		this.visitorGoals = visitorGoals;
	}

	public Goal[] getVisitorGoals() {

		return visitorGoals;

	}

	public void getGoals() {

		int countHome = 0;
		int min = 1;
		int countVisitor = 0;
		for (int i = 0; i < 10; i++) {
			if (homePlayers[i].goals != 0) {
				Goal newGoal = new Goal(homePlayers[i].name, min);
				homeGoals[countHome] = newGoal;
				countHome++;
				min++;
			}
			if (visitorsPlayers[i].goals != 0) {
				Goal newVisGoal = new Goal(visitorsPlayers[i].name, min);
				visitorGoals[countVisitor] = newVisGoal;
				countVisitor++;
				min++;
			}

		}

	}

	public String getWinner() {
		int countHome = 0;
		int countVisitor = 0;
		for (int i = 0; i < 10; i++) {
			if (homeGoals[i] != null) {
				countHome++;
			}
			if (visitorGoals[i] != null) {
				countVisitor++;
			}
		}
		if (countHome > countVisitor) {
			return "Home team wins";
		} else if (countVisitor > countHome) {
			return "Away team wins";
		} else {
			return "It is a tie";
		}

	}

	public SoccerMatch() {
		Date startTime = new Date();
		Date endTime = new Date();
		String location;
		String home;
		String visitor;
		this.homePlayers = homePlayers;
		this.visitorsPlayers = visitorsPlayers;
		this.homeGoals = homeGoals;
		this.visitorGoals = visitorGoals;

	}

	public SoccerMatch(String loc) {
		Date startTime = new Date();
		Date endTime = new Date();
		String location = loc;
		String home;

	}

}
