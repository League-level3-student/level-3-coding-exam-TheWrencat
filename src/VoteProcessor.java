import java.util.ArrayList;
import java.util.HashMap;

public class VoteProcessor {

	public String calculateElectionWinner(ArrayList<String> votes) {

		int votesForP = 0;
		int votesForE = 0;

		for (String v : votes) {
			if (v.equalsIgnoreCase("pope francis")) {
				votesForP++;
			} else {
				votesForE++;
			}
		}
		String winner = "";
		if (votesForP > votesForE) {
			winner = "pope francis";
		} else if (votesForP < votesForE) {
			winner = "edward snowden";
		} else {
			winner = "TIE";
		}

		return winner;

	}
}

