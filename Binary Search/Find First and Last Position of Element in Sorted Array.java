class Solution {
    private int lowsearch(int[] nums,int low , int high , int t){
        int a1=Integer.MAX_VALUE;
        while(low <= high){
            int mid = low + (high -low)/2;
            if(nums[mid] == t){
                a1 = Math.min(lowsearch(nums,low,mid-1,t), mid);
                return a1;
            }
            else if(nums[mid] < t) low = mid+1;
            else high = mid-1;
        }
        return Integer.MAX_VALUE;
    }
    private int highsearch(int[] nums,int low , int high , int t){
        int a1=Integer.MIN_VALUE;
        while(low <= high){
            int mid = low + (high -low)/2;
            if(nums[mid] == t){
                a1 = Math.max(highsearch(nums,mid+1,high,t), mid);
                return a1;
            }
            else if(nums[mid] < t) low = mid+1;
            else high = mid-1;
        }
        return Integer.MIN_VALUE;
    }
    private int[] bsearch(int[] nums , int t){
        int low =0,high = nums.length-1;
        int a1=-1 ,a2=-1;
        while(low <= high){
            int mid = low + (high -low)/2;
            if(nums[mid] == t){
                a1 = Math.min(lowsearch(nums,low,mid-1,t), mid);
                a2 = Math.max(highsearch(nums,mid+1,high,t), mid);
                break;
            }
            else if(nums[mid] < t) low = mid+1;
            else high = mid-1;
        }
        return new int[] {a1,a2};
    }
    public int[] searchRange(int[] nums, int target) {
        if(nums.length <= 0) return new int[] {-1,-1}; 
        if(target < nums[0]) return new int[] {-1,-1};
        return bsearch(nums,target);
    }
}
