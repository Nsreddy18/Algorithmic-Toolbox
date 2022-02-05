import java.util.*;
class fibagain {
    static long pisano(long m){
        long prev = 0;
        long curr = 1;
        long res = 0;
        for(int i = 0; i < m * m; i++)
        {
            long temp = 0;
            temp = curr;
            curr = (prev + curr) % m;
            prev = temp; 
            if (prev == 0 && curr == 1)
                res= i + 1;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long m=sc.nextLong();
        int temp=(int)(pisano(m));
        long arr[]=new long[temp];
        arr[0]=0;
        arr[1]=1;
        if(n<=1){
            System.out.println(n);
        }
        else{
            for(int i=2;i<temp;i++){
                arr[i]=(arr[i-1]+arr[i-2])%m;
            }
            int temp1=(int)(n%temp);
            System.out.println(arr[temp1]);
        }
    }
}
