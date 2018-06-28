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

	public int hashMapCalculator(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		int answer = 0;
		for (int i = 1; i < hashmap1.size(); i++) {
			for (int j = 1; j < hashmap2.size(); j++) {
				if (hashmap1.get(i).equals(hashmap2.get(j))) {

				}
			}
		}

		return answer;
	}
}
