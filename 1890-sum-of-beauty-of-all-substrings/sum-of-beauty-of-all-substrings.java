class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int sum = 0;

        // Fix starting point
        for (int i = 0; i < n; i++) {

            int[] freq = new int[26];

            // Extend substring
            for (int j = i; j < n; j++) {

                char ch = s.charAt(j);
                freq[ch - 'a']++;

                int maxFreq = 0;
                int minFreq = Integer.MAX_VALUE;

                // Find max and min frequency
                for (int k = 0; k < 26; k++) {

                    if (freq[k] > 0) {
                        maxFreq = Math.max(maxFreq, freq[k]);
                        minFreq = Math.min(minFreq, freq[k]);
                    }
                }

                sum += (maxFreq - minFreq);
            }
        }

        return sum;
    }
}