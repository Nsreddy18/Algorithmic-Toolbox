import java.util.*;
class maxloot {
    public static double loot(int n,int w,int[][] arr){
        double ans=0;
        int l=w;
        while(l>=0){
            int k=0;
            double max=0;
            for(int i=0;i<n;i++){
                if(((double)arr[i][0]/(double)arr[i][1])>max){
                    max=(double)arr[i][0]/(double)arr[i][1];
                    k=i;
                }
            }
            if(l<arr[k][1]){
                ans=ans+(l*max);
                break;
            }
            else{
                l=l-arr[k][1];
                ans=ans+(double)arr[k][0];
                arr[k][0]=0;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int w=sc.nextInt();
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(loot(n, w,arr));
    }
}
