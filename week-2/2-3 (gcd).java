import java.util.*;
class gcd {
    static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        int ab=a%b;
        return gcd(b,ab);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(gcd(a,b));
    }
}
