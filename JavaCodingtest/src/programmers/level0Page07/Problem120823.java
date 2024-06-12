package programmers.level0Page07;
import java.util.*;
public class Problem120823 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
     public static void solution() {
    	 Scanner sc = new Scanner(System.in);
    	 int n = sc.nextInt();
    	 StringBuilder sb = new StringBuilder();
    	 for(int i = 1; i <= n; i++) {
    		 sb.append("*");
    		 System.out.println(sb.toString());
    	 }
    }

}
