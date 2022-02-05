import java.util.*;
class advertisement {
    public static long maxrevenue(int n,long[] a,long[] b){
        Arrays.sort(a);
        Arrays.sort(b);
        long result=0;
        for(int i=0;i<n;i++){
            result+=a[i]*b[i];
        }
        return result;
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            long[] a=new long[n];
            long[] b=new long[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextLong();
            }
            for(int i=0;i<n;i++){
                b[i]=sc.nextLong();
            }
            System.out.println(maxrevenue(n,a,b));
    }
}
