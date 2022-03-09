import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer; 
        int cnt= 1;
        ArrayList<Integer> list = new ArrayList<>();
        Stack <Integer> day = new Stack<Integer>(); // 배포하는데 걸리는 날짜 day 스택 에 저장
        
        for(int i=progresses.length-1; i>=0; i--){ //100 - progresses 한뒤, 나누기 speed의 몫.
            day.push((int)Math.ceil((double) (100-progresses[i])/speeds[i]));
        } //day 스택에 거꾸로 저장. 그래야 첫번째 부터 비교. 근데 이럴 거면 큐로 하는게 나을 듯.
        
        int compare = day.pop();
        
        while (!day.empty()){
            if(compare >=day.peek()){
                cnt++;
                day.pop(); // 다음꺼도 비교해야 2일 3일 4일..걸릴지 cnt++해서 계산 가능
            }
            else{
                list.add(cnt);
                compare = day.pop(); //새로 등장한 더 큰 요소랑 그 다음꺼랑 비교해야 하기 때문
                cnt = 1;
            
            }
        }
        list.add(cnt);
        
        //출력
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}