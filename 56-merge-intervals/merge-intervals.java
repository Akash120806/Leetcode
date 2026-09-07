class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<int[]> arr = new ArrayList<>();
        int max = 0;
        int n = intervals.length;
        int start = intervals[0][0];
        int end = intervals[0][1];
        int i = 1;
        while (i < n ) {
            if (i < n  && end >= intervals[i ][0]) {

              end = Math.max(end , intervals[i][1]);
              i++;
            }
            else{
                arr.add(new int[]{start,end});
                start = intervals[i][0];
                end = intervals[i][1];
                i++; 
            }

         
           
        }
         arr.add(new int[]{start,end});

        return arr.toArray(new int[arr.size()][]);
    }
}