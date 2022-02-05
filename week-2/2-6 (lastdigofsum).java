import java.util.*;
class lastdigofsum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int b=(int)(n%60);
        int arr[]=new int[b+2];
        int arr2[]=new int[b+2];
        arr[0]=0;
        arr[1]=1;
        arr2[0]=0;
        arr2[1]=1;
        int sum=1;
        for(int i=2;i<arr.length;i++){
            arr[i]=(arr[i-1]+arr[i-2])%10;
            sum=(sum+arr[i])%10;
            arr2[i]=sum;
        }
        System.out.println(arr2[b]);
    }
}
