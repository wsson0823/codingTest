import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue();
            
        for(int i=0; i<scoville.length; i++){
            heap.add(scoville[i]);
        }
        
        while ( heap.peek() <= K)
        {
            if(heap.size() ==1)
                return -1;
            
            int a = heap.poll();
            int b = heap.poll();
            
            int result = a+(b*2);
            
            heap.add(result);
            
            answer++;

            
        }
  
        return answer;
    }
}