import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i=0; i<players.length; i++) {
            map.put(players[i], i);
        }

        for (String player : callings) {
            int rank = map.get(player);
            String aheadPlayer = players[rank-1];
            players[rank-1] = players[rank];
            players[rank] = aheadPlayer;

            map.put(player, rank-1);
            map.put(aheadPlayer, rank);
        }
        
        return players;
    }
}