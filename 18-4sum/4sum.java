class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++){
            for( int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
               int left=j+1;
               int right=nums.length-1;
               
               while(left<right){
                long sum=(long)nums[i]+nums[j]+nums[left]+nums[right];
                if(sum==target){
                    ans.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) {
                       left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                   right--;
                   }
                }
                else if(sum>target){
                    right--;
                            
                }
                else{
                    left++;
                }
            }
        }
        }
        return ans;
    }
}