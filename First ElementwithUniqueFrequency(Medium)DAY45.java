//First Element with Unique Frequency

//Time Complexity: O(n) - We iterate through the array to count frequencies and then again to find the first unique frequency element.
//Space Complexity: O(n) - We use two HashMaps to store frequencies and their counts, which can grow up to O(n) in the worst case.
import java.util.*;
class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer, Integer>h=new HashMap();
         
            
        for(int n : nums){
            h.put(n, h.getOrDefault(n, 0)+1);
         
        }
        HashMap<Integer, Integer>hm=new HashMap<>();
        for(int a : h.values()){
            hm.put(a, hm.getOrDefault(a, 0)+1);
        }

        for(int n : nums){
            int a=h.get(n);
            if(hm.get(a)==1){
                return n;
            }
        }
        

        return -1;
   
        
        
        

            
            
            
        
        
    }
}
