import java.util.*;
  
 //Time Complexity: O(n log n) - n for iterating through bulbs and counting, n log n for sorting
//Space Complexity: O(n) - HashMap stores up to n unique entries, result list stores unique bulbs
 
class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        
        HashMap<Integer, Integer>h=new HashMap<>();
        for(int n : bulbs){
            if(h.containsKey(n)){
                h.put(n, h.get(n)+1);
            }
            else{
                h.put(n, 1);
            }
            
        }
        List<Integer> result = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : h.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value % 2 == 0) {

            } else {
                result.add(entry.getKey());
                

            }
        }
        Collections.sort(result);
        return result;
        
    }

}
