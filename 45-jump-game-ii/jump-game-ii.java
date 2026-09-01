class Solution {
    public int jump(int[] nums) {
        if(nums.length==1)return 0;
        int n = nums.length -1;
        int c=0;
        int last_index =0;
        int jumps=0;
        
        for(int i=0;i<=n;i++){
            c = Math.max(c,nums[i]+i);
            if(last_index==i){
                last_index=c;
                jumps++;
                            if(c>=n)return jumps;

            }



        }
        return jumps;
    }
}