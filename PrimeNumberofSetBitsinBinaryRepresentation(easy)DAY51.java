//PrimeNumberofSetBitsinBinaryRepresentation(easy)DAY51 {

//brute force approach O(n square) 
/*import java.util.*;
class Solution {
    public int countPrimeSetBits(int left, int right) {
        int g=0;
        int count=0;
        boolean b=true;
        for(int i=left;i<=right;i++){
            String a=Integer.toBinaryString(i);
            for(int j=0;j<a.length();j++){
                int k = Character.getNumericValue(a.charAt(j));
                g=g+k;
            }
            if(g==2){
                count++;
            }
            for(int l=2;l<g;l++){
                if(g%l==0){
                    b=false;
                    break;
                    

                }

            }
            if(b==true && g!=0 && g!=1 && g!=2){
                count++;
            }
            g=0;
            b=true;

            
        }
        return count;
        
    }
}*/

//optimal approach O(n) 
import java.util.*;
class Solution {
    private static Set<Integer> primes = Set.of(2, 3, 5, 7, 11, 13, 17, 19);

    public int countPrimeSetBits(int left, int right) {
        int ans = 0;
        for (int i = left; i <= right; ++i) {
            if (primes.contains(Integer.bitCount(i))) {
                ++ans;
            }
        }
        return ans;
    }
}