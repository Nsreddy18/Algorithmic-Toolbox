import java.util.*;
class fiblast{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long arr[]=new long[n];
        if(n<=1){
            System.out.println(n);
        }
        else{
            arr[0]=1;
            arr[1]=1;
            for(int i=2;i<n;i++){
                arr[i]=(arr[i-1]+arr[i-2])%10;
            }
        System.out.println(arr[n-1]);
        }
    }
}