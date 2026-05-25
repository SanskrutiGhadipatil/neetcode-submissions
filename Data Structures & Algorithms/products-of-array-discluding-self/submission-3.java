class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] left = new int[n];
        left[0]=1;
        //create left array
        for(int i=1;i<n;i++){
            left[i]=nums[i-1]*left[i-1];
        }
        int[] res=new int[n];
        //create right array
        int suffix=1;
        for(int j=n-1;j>=0;j--){
            res[j]=left[j]*suffix;
            suffix=suffix*nums[j];
        }
        return res;
    }
}  
