import java.util.*;

class Solution {
    
    public int[] solution(int[] numbers) {
        ArrayList<Integer> array = new ArrayList<>();
        
        for(int i=0; i<numbers.length-1 ; i++){
            for(int j=i+1; j<numbers.length ; j++){
                if(!array.contains(numbers[i]+numbers[j])){ // array에 포함되지 않은 값이라면
                    array.add(numbers[i]+numbers[j]); //추가
                }
            }
        }
        Collections.sort(array);
        
        int[] answer = new int[array.size()];
        
        for(int i=0; i<array.size(); i++){
            answer[i] = array.get(i);
        }
        
        return answer;
    }
}