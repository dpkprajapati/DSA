class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xorSum = 0;
        for (int k : nums){
            xorSum = xorSum^k;
        }
        for(int i =0; i <=n ; i++){
            xorSum ^=i;
        }
        return xorSum;
    }
}