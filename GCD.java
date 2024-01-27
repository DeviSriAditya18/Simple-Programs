import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int max=1;
        for(int i=2;i<=n;i++){
           if(m%i==0&&n%i==0) max=i;
        }
        System.out.print("GCD of "+m+" and "+n+" is:"+max);
    }
}
