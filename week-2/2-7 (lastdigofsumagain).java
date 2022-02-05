import java.util.*;
class lastdigofsumagain{
    static long pisn(long n){
        long sum=1;
        int a=(int)((n)%60);
        long[] arr=new long[a+2];
        long[] arr2=new long[a+2];
        arr[0]=0;
        arr[1]=1;
        arr2[0]=0;
        arr2[1]=1;
        if(n<=1){
            return n;
        }
        else{
            for(int i=2;i<arr.length;i++){
                arr[i]=(arr[i-1]+arr[i-2])%10;
                sum=(sum+arr[i])%10;
                arr2[i]=sum;
            }
            return arr2[a];
        }
    }
    static long pism(long m){
        long sum=1;
        int a=(int)((m-1)%60);
        long arr[]=new long[a+2];
        long arr2[]=new long[a+2];
        arr[0]=0;
        arr[1]=1;
        arr2[0]=0;
        arr2[1]=1;
        if(m<=1){
            return arr2[a];
        }
        else{
            for(int i=2;i<arr.length;i++){
                arr[i]=(arr[i-1]+arr[i-2])%10;
                sum=(sum+arr[i])%10;
                arr2[i]=sum;
            }
            return arr2[a];
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long m=sc.nextLong();
        long n=sc.nextLong();
        if(m==0){
            System.out.println(pisn(n));
        }
        else{
            System.out.println((10+(pisn(n)-pism(m)))%10);
        }
    }
}

