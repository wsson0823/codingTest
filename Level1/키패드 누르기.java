
class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int leftIndex = 10; //왼손엄지
        int rightIndex = 12; //오른손 엄지

        for(int num : numbers){
            if(num == 1 || num == 4 || num == 7){
                answer.append("L");
                leftIndex = num; //왼손 이동으로 인한 인덱스 변경
            }
            else if(num ==3 || num==6 || num == 9){
                answer.append("R");
                rightIndex = num; //오른손 이동으로 인한 인덱스 변경
            }
             else{ 
                int leftLength = getlength(leftIndex, num); //현재 왼손과 목표지점 거리 계산
                int rightLength = getlength(rightIndex, num);//현재 오른손과 목표지점 거리 계산
                 
              if(leftLength > rightLength) {
					answer.append("R");
					rightIndex = num;
				} else if(leftLength < rightLength) {
					answer.append("L");
					leftIndex = num;
				} else {
					if(hand.equals("right")) {
						answer.append("R");
						rightIndex = num;
					} else {
						answer.append("L");
						leftIndex = num;
					}
				}              
             }
        }
        return answer.toString();
    }

    public static int getlength(int index, int num){
        
        if(index ==0)
            index = 11;
        if(num ==0)
            num = 11; //0이라면 새로운 인덱스 11로 초기화
/*
좌, 우측의 x 좌표 규칙
(숫자-1) / 3 ---> (index-1) / 3

좌, 우측의 y 좌표 규칙은
(숫자-1) % 3 ---> (index-1) % 3

중앙 번호의 x 좌표의 규칙
숫자/3 ---> number / 3

중앙 번호의 y 좌표는 모두 1.

*/   
        int x = (index-1)/3; // 1~12 까지 부여한 수 중 거리 계산을 위한 x좌표
        int y = (index-1)%3;
        int CenterX = num/3;
        int CenterY = 1;      
        return Math.abs(x-CenterX) + Math.abs(y-CenterY);
    } 
}
