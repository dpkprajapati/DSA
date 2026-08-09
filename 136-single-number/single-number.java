class Solution {
    public int singleNumber(int[] nums) {
        int singleNum = 0;
        for(int k : nums){
            singleNum^=k;
       }
       return singleNum;

    }
}