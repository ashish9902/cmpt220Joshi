package area;

import java.util.Date;
import java.util.Scanner;

public class SoccerMatchDriver {
	public static void main(String[] args) {

		Player player1 = new Player("Tim", "Dragons", 1);

		Date startDate = new Date(1551607200000L);
		//converted to milliseconds 
		Date endDate = new Date(15516014400000L);
		// converted to milliseconds
		Player player2 = new Player("Joe", "Dragons", 1);
		Player player3 = new Player("Tom", "Dragons", 0);
		Player player4 = new Player("Jack", "Dragons", 0);
		Player player5 = new Player("Tim", "Dragons", 0);
		Player player6 = new Player("John", "Dragons", 0);
		Player player7 = new Player("Timber", "Dragons", 0);
		Player player8 = new Player("Joe", "Dragons", 0);
		Player player9 = new Player("Tm", "Dragons", 0);
		Player player10 = new Player("Jon", "Dragons", 0);
		Player player11 = new Player("Tam", "Dragons", 0);

		Player player01 = new Player("Z", "Rams", 1);
		Player player02 = new Player("A", "Rams", 0);
		Player player03 = new Player("B", "Rams", 0);
		Player player04 = new Player("C", "Rams", 0);
		Player player05 = new Player("D", "Rams", 0);
		Player player06 = new Player("E", "Rams", 0);
		Player player07 = new Player("F", "Rams", 0);
		Player player08 = new Player("G", "Rams", 0);
		Player player09 = new Player("H", "Rams", 0);
		Player player010 = new Player("I", "Rams", 0);
		Player player011 = new Player("J", "Rams", 0);

		Player homeTeam[] = { player1, player2, player3, player4, player5, player6, player7, player8, player9, player10,
				player11 };
		Player visitorTeam[] = { player01, player02, player03, player04, player05, player06, player07, player08,
				player09, player010, player011 };
		Goal home[] = new Goal[11];
		Goal visitor[] = new Goal[11];

		SoccerMatch match1 = new SoccerMatch(startDate, endDate, "Madrid", "Madrid", homeTeam, visitorTeam, home,
				visitor);

		match1.getGoals();
		System.out.println(match1.getWinner());

	}

}
