class Solution {
    public int countQuadruplets(int[] nums) {
        int count=0;
        for(int a=3;a<nums.length;a++){
            int target=nums[a];
        
        for(int i=0; i<a-2;i++){
            for(int j=i+1; j<a-1; j++){
                for( int k=j+1; k<a; k++){
                    if(nums[i]+nums[j]+nums[k]==target){
                        count++;
                    }
                }
            }
        }
      }
        return count;
    }
}