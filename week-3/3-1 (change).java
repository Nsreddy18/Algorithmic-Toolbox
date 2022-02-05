import java.util.*;
class change{
    public static int change(int n){
        int ans=0;
        while(n>=10){
            n=n-10;
            ans++;
        }
        while(n>=5){
            n=n-5;
            ans++;
        }
        ans=ans+n;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(change(n));
    }
}