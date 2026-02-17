//1)Binary Watch

import java.util.*;
class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result= new ArrayList<>();

        for(int h=0; h<12;h++){
            for(int m=0;m<60;m++){
                int tb=Integer.bitCount(h)+ Integer.bitCount(m);

                if(tb==turnedOn){
                    result.add(h+ ":" + String.format("%02d", m));
                }
            }
        }
        return result;

        
    }
}
