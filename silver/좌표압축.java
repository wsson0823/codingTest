import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;

public class 좌표압축 {
    public static void main(String[] args) {

        HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>(); //순위를 매길 해쉬맵.
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] origin = new int[N];
        int[] sorted = new int[N];

        for(int i =0; i<N;i++){
            origin[i] = sorted[i] = scan.nextInt();
        }

        Arrays.sort(sorted); // 오름차순 정렬.
        int rank = 0;
        for( int i : sorted){
            if(!rankingMap.containsKey(i)){ //원소가 순위를 매길 해쉬맵에 들어있으면 안되므로 없을때만 추가
                rankingMap.put(i,rank);// i번째에 rank 추가 (0부터)
                rank++; //다음 순서 가르키도록
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int key : origin){
            int ranking = rankingMap.get(key); //원본에 대한 value(순위)를 ranking에 저장.
            sb.append(ranking).append(' ');
        }
        System.out.println(sb);
    }
}
