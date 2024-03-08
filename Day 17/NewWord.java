import java.util.*;
class NewWord {
    public static void sol(int[] nums,int k,int i,int ans[],boolean[] hash){
        if(k==0)ans[0]++;
        if(i==nums.length)return;
        if(hash[nums[i]]){
            sol(nums,k,i+1,ans,hash);
        }
        else if(k>0){
            hash[nums[i]]=true;
            sol(nums,k-1,i+1,ans,hash);
            hash[nums[i]]=false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)nums[i]=sc.nextInt();
        int[] ans=new int[1];
        boolean[] hash=new boolean[n+1];
        for(int i=0;i<n;i++){
            sol(nums,k,i,ans,hash);
        }
        System.out.println(ans[0]);
    }
}