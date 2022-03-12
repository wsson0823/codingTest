import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
       ArrayList<Integer> arr = new ArrayList<Integer>();
     
        String[] str = s.split(" "); //split 을 이용한 공백 제거
        
        for(int i=0; i<str.length; i++) {
            arr.add(Integer.parseInt(str[i])); //arraylist에 공백을 제거한 str 순차적으로 삽입.
        }
        
        
        answer = ""+Collections.min(arr) +" "+Collections.max(arr);

        return answer;
    }
}

