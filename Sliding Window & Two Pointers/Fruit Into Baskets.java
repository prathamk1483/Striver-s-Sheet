class Solution {
    public static int totalFruits(Integer[] arr){
        int i=0,j=0,ans=0;
        Map<Integer,Integer> m = new HashMap<>();
        
        while(j<arr.length){
            m.put(arr[j],m.getOrDefault(arr[j],0)+1);
            if(m.size() >2){
                m.put(arr[i],m.getOrDefault(arr[i],0)-1);
                if(m.get(arr[i]) <=0) m.remove(arr[i]);
                i++;
            }
            
            ans = Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}
