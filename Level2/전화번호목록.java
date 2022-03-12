import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<phone_book.length; i++){ // length : 배열의 길이
            map.put(phone_book[i], i);
        }   //map(전화번호부) 생성
        
        for(int i=0; i<phone_book.length; i++)
            for(int j=1; j<phone_book[i].length(); j++) //length() : 문자의 길이
                if(map.containsKey(phone_book[i].substring(0,j)))
                    return false;
        return true;
        
    }
}