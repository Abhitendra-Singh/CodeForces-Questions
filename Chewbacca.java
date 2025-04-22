import java.util.*;
public class Chewbacca{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long temp = n ;
        long answer = 0 ;
    String res = "";
        while(temp!=0){
            long mod = temp%10;
            mod = Math.min(mod , Math.abs(9-mod));
            res = String.valueOf(mod)+res;
            temp=temp/10;
        }
        answer = Integer.parseInt(res);
        System.out.println(answer);
    }
}