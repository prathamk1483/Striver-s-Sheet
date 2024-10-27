class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int can1 =-1, can2 = -1,c1 = 0 ,c2=0;
        for(int i: nums){
            if(c1 == 0 && can2 != i){ 
                can1 = i;
                c1 = 1;    
            }
            else if(c2 == 0 && can1 != i){ 
                can2 = i;
                c2 = 1;    
            }
            else if(can1 == i) c1++;
            else if(can2 == i) c2++;
            else{
                c1--;
                c2--;
            }
        }
        c1 = 0;c2 = 0;
        for(int i: nums){
            if(i == can1 ) c1++;
            else if(i == can2) c2++;
        }
        if(c1 >= nums.length/3 +1) ans.add(can1);
        if(c2 >= nums.length/3+1) ans.add(can2);

        return ans;
    }
}
