import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int prefixSum = 0;
        HashMap<Integer, Integer> prefixMap = new HashMap<>();
        prefixMap.put(0, 1);
        
        for (int num : nums) {
            prefixSum += num;
            int requiredPrefix = prefixSum - k;
            count += prefixMap.getOrDefault(requiredPrefix, 0);
            prefixMap.put(prefixSum, prefixMap.getOrDefault(prefixSum, 0) + 1);
        }
        
        return count;
    }
}
