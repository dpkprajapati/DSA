class Solution {
    public int findNumbers(int[] nums) {
        int evenCount = 0;
        for(int k : nums){
           if( k >=10 && k <= 99 || k >=1000 && k<=9999 || k == 100000){
            evenCount++;
           }
        }
        return evenCount;
    }
}