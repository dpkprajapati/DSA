class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> set =  new HashSet<>();
        for(int k : nums){
           if( !set.add(k)){
                return true;
           }
        }
        return false;
    }
}