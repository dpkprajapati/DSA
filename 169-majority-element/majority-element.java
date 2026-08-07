class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int freq = 1;
        int ans = nums[0];
        for(int i = 1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                freq+=1;
            }
            else{
                freq=1 ;
                ans = nums[i];
            }
            if(freq > n/2){
                return ans ;
            }
        }
        return ans;
    }
}