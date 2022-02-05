import java.util.*;
class lcm {
    static long gcd(long a,long b){
        if(b==0){
            return a;
        }
        long ab=a%b;
        return gcd(b,ab);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextInt();
        long b=sc.nextInt();
        long lcm=(a*b)/gcd(a,b);
        System.out.println(lcm);
    }
}
