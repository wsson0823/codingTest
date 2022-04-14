class 네트워크 {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        boolean check [] = new boolean[n];
        
        for(int i=0; i<n ; i++){
            check[i] = false;     //방문 유무 배열 false로 초기화.
        }
        
        
        for(int i=0; i<computers.length ; i++){
            if(!check[i]){ //check[i]가 false 면
                dfs(computers, i, check);
                answer++;
            }       
        }
        return answer;   
    }
    /*
    조건 1: 자기 자신이 아니고(무조건 1이기 때문)
    조건 2 : computer[i][j]가 1이고
    조건 3 : check 배열이 false 면 (방문 안함)
    재귀.
    */
    
    boolean[] dfs (int[][] computers, int i, boolean[] check){
        check[i] = true;            
        for( int j=0 ; j<computers.length; j++){
            if( i!=j && computers[i][j] == 1 && check[j] == false){
                check = dfs (computers, j , check);
            }
        }
        return check;
    }
    
    
}