import java.util.*;
class 여행경로 {
    static ArrayList<String> list = new ArrayList<>();
    static boolean useTickets[];
    
    public String[] 여행경로(String[][] tickets) {
       
        useTickets = new boolean[tickets.length]; //기본적으로 false로 초기화
        dfs(0, "ICN", "ICN", tickets); //depth, 현재위치, 방문한경로, 문제에서 주어진 티켓 경로
        Collections.sort(list); //정렬을 해주면 알파벳 순서가 앞서는 경로가 첫번째 인덱스로 이동.
        return list.get(0).split(" ");
    }
    
    static void dfs( int depth, String now, String path, String[][] tickets){
        if(depth == tickets.length) {//마지막 단계라면 종료.
            list.add(path);
            return;
        }
        
        for(int i=0; i<useTickets.length; i++){
            if( !useTickets[i] && now.equals(tickets[i][0])){
             //아직 방문을 안했고, 현재위치와 문제에서 주어진 시작 경로가 같다면
                useTickets[i] = true;
                dfs(depth + 1, tickets[i][1], path+" "+tickets[i][1], tickets);
                // 단계 증가, 시작위치에서 도착위치로 변경, 방문한 경로를 공백으로 이어줌.
                useTickets[i] = false;
            }
        }
        
    }
    
    
}