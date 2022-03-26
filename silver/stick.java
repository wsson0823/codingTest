import java.util.Scanner; 
public class stick { 
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in); 
        int value = scan.nextInt(); 
        int stick = 64; 
        int count = 0; 
        while(value>0) { 
            if (value<stick) { 
                stick/=2; 
            }else { 
                value -= stick;
                count++; 
            } 
        } 
        System.out.println(count); 
    } 
}

