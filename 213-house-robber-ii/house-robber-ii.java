class Solution {
    public int rob(int[] nums) {
          if (nums.length == 1) {
            return nums[0];
        }
        int []firsthouse= new int[nums.length-1];
        int []lasthouse= new int[nums.length-1];

        
        for(int i=0;i<nums.length;i++){
            if(i!=nums.length-1){
                firsthouse[i]=nums[i];
            }
            if(i!=0){
                lasthouse[i-1]=nums[i];
            }
           
        }
         return Math.max(countrob(lasthouse),countrob(firsthouse));
        
    }
    static int countrob(int[]arr){
            if(arr.length==1)return arr[0];
            int dp[]=new int[arr.length];
            dp[0]=arr[0];
            dp[1]=Math.max(arr[0],arr[1]);
             for(int i = 2; i<arr.length;i++){
                dp[i]=Math.max(arr[i]+dp[i-2],dp[i-1]);
                }
            return dp[dp.length-1];
        }

}