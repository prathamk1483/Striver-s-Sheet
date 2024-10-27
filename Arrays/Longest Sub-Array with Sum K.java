class Solution {
    public static int lenOfLongSubarr(int A[], int N, int K) {
        int prefixSum = 0;
        int ans = 0;
        HashMap<Integer, Integer> prefixMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            prefixSum += A[i];

            if (prefixSum == K) {
                ans = i + 1;
            }

            int requiredPrefix = prefixSum - K;

            if (prefixMap.containsKey(requiredPrefix)) {
                ans = Math.max(ans, i - prefixMap.get(requiredPrefix));
            }

            if (!prefixMap.containsKey(prefixSum)) {
                prefixMap.put(prefixSum, i);
            }
        }

        return ans;
    }
}
