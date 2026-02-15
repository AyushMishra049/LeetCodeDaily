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

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Test case 1
        List<Integer> bulbs1 = Arrays.asList(1, 2, 2, 3, 3, 3);
        System.out.println("Input: " + bulbs1);
        System.out.println("Output: " + sol.toggleLightBulbs(bulbs1));
        
        // Test case 2
        List<Integer> bulbs2 = Arrays.asList(1, 1, 1, 1);
        System.out.println("\nInput: " + bulbs2);
        System.out.println("Output: " + sol.toggleLightBulbs(bulbs2));
        
        // Test case 3
        List<Integer> bulbs3 = Arrays.asList(5, 4, 3, 2, 1);
        System.out.println("\nInput: " + bulbs3);
        System.out.println("Output: " + sol.toggleLightBulbs(bulbs3));
    }
}
