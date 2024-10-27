class GfG
{
    int maxLen(int arr[], int n)
    {
        HashMap<Integer, Integer> prefixMap = new HashMap<>();
        int maxLength = 0;
        int prefixSum = 0;

        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];
            if (prefixSum == 0) {
                maxLength = i + 1;
            }
            
            if (prefixMap.containsKey(prefixSum)) {
                int prevIndex = prefixMap.get(prefixSum);
                maxLength = Math.max(maxLength, i - prevIndex);
            } 
            else {
                prefixMap.put(prefixSum, i);
            }
        }

        return maxLength;
    }
}
