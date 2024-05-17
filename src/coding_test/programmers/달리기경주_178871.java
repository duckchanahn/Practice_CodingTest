package coding_test.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class 달리기경주_178871 {

	private HashMap<String, Integer> memory;

	public String[] solution(String[] players, String[] callings) {
		this.memory = new HashMap<>();
		this.makingHash(players);

		for(String c : callings) this.swap(players, c);
		return players;
	}

	private void swap(String[] players, String calling) {
		int idx = this.memory.get(calling);

		String temp = players[idx-1];
		players[idx-1] = calling;
		memory.put(calling, idx-1);
		players[idx] = temp;
		memory.put(temp, idx);
	}

	private void makingHash(String[] players) {
		for(int i = 0; i < players.length; i++) {
			this.memory.put(players[i], i);
		}
	}

}
