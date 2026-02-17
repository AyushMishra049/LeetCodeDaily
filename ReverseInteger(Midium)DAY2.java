//1) Reverse Integer

class Solution {
    public int reverse(int x) {

        long re=0;
        long n=x;
        
        while(n!=0){
            long a=n%10;
            re=re*10+a;
            n=n/10;
        }

        if(re>Integer.MAX_VALUE || re<Integer.MIN_VALUE){
            return 0;
        }
        else{
            return (int)re;

        }

        
        
    }
}
