//FindFirstandLastPositionofElementinSortedArray(easy)DAY53

//O(log n) time complexity, O(1) space complexity
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int r[]={-1,-1};
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            int m=(i+j)/2;
            if(nums[m]<target){
                i=m+1;
            }
            else{
                j=m-1;
            }
            if(nums[m]==target){
                r[0]=m;

            }
        }
        // Reset pointers
        i = 0;
        j = nums.length - 1;

        // Find Last Position
        while (i <= j) {
            int m = (i + j) / 2;

            if (nums[m] > target) {
                j = m - 1;
            } else {
                i = m + 1;
            }

            if (nums[m] == target) {
                r[1] = m;
            }
        }
        return r;
        
    }
}
