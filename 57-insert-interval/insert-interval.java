class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int[][] result = new int[n + 1][2];
        int i = 0;
       int j =0;
        // int max=0,min=0;
        while (i < n) {
            if(i< n && intervals[i][1]<newInterval[0] ){
                result[j]=intervals[i];
                 j++;
                 i++;
            }
            else{break;}
           
        }
        while(i< n && intervals[i][0]<= newInterval[1] ){
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        result[j]=newInterval;
        
        j++;
        while(i<n){
            result[j]=intervals[i];
            i++;j++;
        }
        return Arrays.copyOf(result, j); 
    }
}