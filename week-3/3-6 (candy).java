import java.util.*;
class candy{
    public static void count(long n){
        long temp=n;
        long sum=0;
        long count=0;
        List<Long> arr=new ArrayList<>();
        long i=1;
        if(n==0){
            System.out.println("0");
        }
        else{
            while(n>=0){
                if(sum<=temp && (n-i)>=0){
                    arr.add(i);
                    sum+=i;
                    n=n-i;
                    i++;
                }
                else{
                    arr.set(arr.size()-1,arr.get(arr.size()-1)+n);
                    break;
                }
                count++;
            }
            System.out.println(count);
            for(int j=0;j<arr.size();j++){
                System.out.print(arr.get(j)+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        count(n);
    }
}