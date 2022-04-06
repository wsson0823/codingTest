import java.util.*;
public class 위장 {
    public int solution(String[][] clothes) {
       
        
        //1. 옷을 종류별로 구분.
        //2. 입지 않는 경우를 추가해서 모든 조합 계산
        //3. 조합 수.
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for(int i=0; i<clothes.length ; i++){
            String key = clothes[i][1]; //옷 종류만 가져옴.
            
            if( !map.containsKey(key)){
                map.put(key,1); // 새로운 옷 종류일경우 1 추가 해줌.
            }
            else{ //1 이상일 경우
                map.put(key, map.get(key) + 1); //키 가져오고 +1
            }
        }
        
        Iterator<Integer> it = map.values().iterator();
        int answer = 1; //1개부터 시작.
        
        while(it.hasNext()) {//value 하나씩 꺼내오기.
            answer *=it.next().intValue() +1 ;//입지 않은거도 계산해서 경우의 수 계산(계산 과정에서 곱셉임.)
        } 
        
        
        return answer - 1; //아무것도 입지 않은 경우 제외
    }
}
