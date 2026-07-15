class Solution {
    public int removeDuplicates(int[] nums) {
       int count=1;
       int office=0;

       int cm=1;
       while(cm<nums.length){
        if(nums[cm]==nums[cm-1]){
            cm++;
        }
        else{
            nums[office+1]=nums[cm];
            count++;
            office++;
            cm++;
        }
       }
      return count;
    }
}