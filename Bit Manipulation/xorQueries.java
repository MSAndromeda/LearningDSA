class Solution {
    public int[] xorQueries(int[] presum, int[][] queries) {
        for(int i = 1; i < presum.length; i++){
            presum[i] ^= presum[i-1];
        }

        int querylen = queries.length;
        int[] ans = new int[querylen], q;
        for(int i = 0; i < querylen; i++){
            q = queries[i];
            ans[i] = (q[0] > 0)? presum[q[1]]^presum[q[0]-1] : presum[q[1]];
        }
        return ans;
    }
}