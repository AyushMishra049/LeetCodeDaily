//BinaryGap(easy)DAY52

class Solution {
    public int binaryGap(int n) {
        String a = Integer.toBinaryString(n);

        int last = -1;   // stores index of previous '1'
        int max = 0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '1') {   // compare with '1'
                if (last != -1) {
                    max = Math.max(max, i - last);
                }
                last = i;
            }
        }

        return max;
    }
}
    
