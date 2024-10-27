class Solution {
    public void sortColors(int[] nums) {
        int colors[] = new int[3];
        for(int i:nums){
            colors[i]++;
        }
        int idx = 0;
        for(int i=0;i<3;i++){
            int count = colors[i];
            for(int j=0;j<count;j++){
                nums[idx++] = i;
            }
        }
        return;
    }
}
