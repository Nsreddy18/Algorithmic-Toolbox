import java.util.*;
class carfuel {
    public static int refuel(int d,int m,int n,int[] arr){
        int count=0;
        int last=0;
        int current=0;
        while(current<=n){
            last=current;
            while(current<=n && arr[current+1]-arr[last]<=m){
                current=current+1;
            }
            if(current==last){
                return -1;
            }
            if(current<=n){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n+2];
        arr[0]=0;
        arr[n+1]=d;
        for(int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(refuel(d, m, n, arr));
    }
}
