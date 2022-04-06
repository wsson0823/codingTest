public class 완주하지 못한 선수 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        //1. hashmap 만들기 (participant)
        //2. hashmap 빼기 (completion)
        //3. value !=0 인 마지막 주자 찾기.
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String player : participant){
            map.put(player, map.getOrDefault(player,0) +1); // 존재하면 player에 +1 넣고 존재하지 않으면 0으로 초기화 후 +1.
        }
        
         for (String player : completion){
             map.put(player, map.get(player)-1); //다 들어가있으므로 player에서 -1 뺀값 넣기.
         }
        
         for (String key : map.keySet()){ //map이 가지고 있는 key를 꺼냄.
             if(map.get(key) != 0 ){
                 answer = key;
                 break; // 효율성을 위한 break 추가.
             }
         }
        
        
        return answer;
    }
}
