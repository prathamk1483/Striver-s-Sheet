class Compute {
    
    public int largest(int arr[], int n)
    {
        int max=0;
        for(int i=0;i<n;i++){
            max = Math.max(max , arr[i]);
        }
        return max;
    }
}
