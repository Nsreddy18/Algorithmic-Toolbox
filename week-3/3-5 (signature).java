import java.util.*;
class signature {
    public static void count(int n,long[][] arr){
        int count=1;
        List<Long> list=new ArrayList<>();
        Arrays.sort(arr,(a,b)->Long.compare(a[1],b[1]));
        long end=arr[0][1];
        list.add(end);
        for(int i=1;i<n;i++){
            if(arr[i][0]<=end){
                continue;
            }
            else{
                end=arr[i][1];
                list.add(end);
                count++;
            }
        }
        System.out.println(count);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[][] arr=new long[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=sc.nextLong();
            }
        }
        count(n, arr);
    }
}
