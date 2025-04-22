import java.util.*;

public class softDrinking{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt() ;
        int k = sc.nextInt();
                int l= sc.nextInt() ;
        int c = sc.nextInt();
                int d= sc.nextInt() ;
        int p = sc.nextInt();
                int nl= sc.nextInt() ;
        int np = sc.nextInt();
    int totalDrink =(k*l)/nl;
    int totalLime = c*d;
    int totalSalt= p/np;
    int min = Math.min(totalDrink , Math.min(totalLime , totalSalt));
    if(min==0)  System.out.println("0");
    else
    System.out.println(min/n);

    }
}