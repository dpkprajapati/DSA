class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int mid = start+(end-start)/2;
        int ans = -1;
        while(start<=end){
            if(arr[mid]>=arr[mid+1]){
                ans = mid;
                end = mid-1;
            }
            else if (arr[mid]<=arr[mid+1]){
                start = mid+1;
            }
            mid = start+(end-start)/2;

            
        }
        return ans;
    }
}
