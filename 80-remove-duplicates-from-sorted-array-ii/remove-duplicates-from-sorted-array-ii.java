class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length <=2){
            return nums.length;
        }
        
        int count=2;

        int office=2;
        int a=2;

        while(a<nums.length){
            if(nums[a]==nums[office-2]){
                a++;
            }
            else{
                 nums[office]=nums[a];
                 a++;
                 office++;
                 count++;
            }
        }
        return count;

    }
}