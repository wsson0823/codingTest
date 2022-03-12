class Solution {
    
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0); //해당배열, 목표 값, 시작 레벨, 요소의 합 시작
    }
     public int dfs(int[] numbers, int target, int level, int sum) {
         /*
         이 if문은 dfs가 노드 끝까지 도달했을때 계산한 값과 목표 값이 일치하는지 여부 물어봄.
         같다면 정답이므로 방법 개수 return 1 사용함으로써 추가.
         */
         if(level==numbers.length){
             if(target == sum)
                 return 1; 
             else
                 return 0;
         }        
         return dfs(numbers,target, level+1, sum+numbers[level]) + dfs(numbers,target, level+1, sum-numbers[level]);   
    }
}