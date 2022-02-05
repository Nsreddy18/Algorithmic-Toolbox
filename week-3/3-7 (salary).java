import java.util.*;
class salary {
    public static boolean check(int n1,int n2){
        String temp1=String.valueOf(n1)+String.valueOf(n2);
        String temp2=String.valueOf(n2)+String.valueOf(n1);
        if(Integer.parseInt(temp1)>=Integer.parseInt(temp2)){
            return true;
        }
        else{
            return false;
        }
    }
    public static String answer(int n,List<String> s){
        StringBuilder ans=new StringBuilder();
        while(!s.isEmpty()){
            int max=0;
            int k=0;
            for(int i=0;i<s.size();i++){
                if(check(Integer.parseInt(s.get(i)), max)){
                    max=Integer.parseInt(s.get(i));
                }
            }
            ans.append(String.valueOf(max));
            s.remove(new String(String.valueOf(max)));
        }
        return String.valueOf(ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] temp=sc.nextLine().split(" ");
        List<String> s=new ArrayList<>();
        for(int i=0;i<n;i++){
            s.add(temp[i]);
        }
        System.out.print(answer(n, s));
    }
}
