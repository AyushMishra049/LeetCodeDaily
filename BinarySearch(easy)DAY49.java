//Binary Search

class Solution {
    public int search(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        //int m=(i+j)/2;
        while(i<=j){

           int m=(i+j)/2;

            if(target==nums[m]){
                return m;
            }

            if(target>nums[m]){
                i=m+1;
            }
            else{
                j=m-1;

            }
 
          
            
        }
        return -1;
        
    }
}
