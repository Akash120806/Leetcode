class Solution {
    public int countCommas(int n) {
        if(n<1000)return 0;
        int count =0;
        while(n>=1000){
            count = n-1000;
            n=n/1000;
          
        }
        return ++count;
    }
}