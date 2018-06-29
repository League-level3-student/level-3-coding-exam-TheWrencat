import java.util.HashMap;

public class HashMapCalculator {
	int answer;
	public int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
	int answer = 0;
	
	for(String s:hashmap1.keySet()) {
		for(String t:hashmap2.keySet()) {
			if(s.equals(t)) {
				if(hashmap1.get(s).equals(hashmap2.get(t)))
					answer++;
			}
		}
	}
	
	System.out.println(answer);
	return answer;
	}

}
