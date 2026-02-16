//1)Reverse Bits
//Time Complexity: O(1) as we are always iterating 32 times
//Space Complexity: O(1) as we are using only constant space

class Solution {
    public int reverseBits(int n) {
        String binary = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
        StringBuilder s=new StringBuilder(binary);
        s.reverse();

        int number = Integer.parseInt(s.toString(), 2);
        return number;


        
    }
}