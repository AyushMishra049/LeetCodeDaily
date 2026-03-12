//1)Find Peak Element
//Time Complexicity: O(log n)
//Space Complexicity: O(1)

class Solution {
    public int findPeakElement(int[] nums) {

   
        
        int i=0;
        int j=nums.length-1;
        int m=0;
        while(i<j){
            m=(i+j)/2;
            if(nums[m]>nums[m+1]){
                j=m;
            }
            else{
                i=m+1;
            }


        }
        return i;
    }
}
