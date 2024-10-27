class Solution {
    // Function to find pair with maximum sum
    public int pairWithMaxSum(List<Integer> arr) {
        // Your code goes here
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.size()-1;i++){
                sum=arr.get(i)+arr.get(i+1);
                max=Math.max(max,sum);
        }
        return max;
    }
}
