class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(even(nums[i])){
            count++;
        }
        }
        return count;
    }
    static boolean even(int m){
        int a=digit(m);
        if(a%2==0){
            return true ;
        }
        return false;
    }
    static int digit(int n){
        int count =0;
        while(n > 0){
            count++;
            n=n/10;
        }
        return count;
    }
}