class Solution {
    public int rob(int[] nums) {
        if(nums.length<2){
            return nums[0];
        }

        int house1=nums[0];
        int house2=Math.max(nums[0],nums[1]);

        //[2,9,8,3,6]
        for(int i=2;i<nums.length;i++){
            int temp=Math.max(house2,house1+nums[i]);
            house1=house2;
            house2=temp;
        }
        return house2;
    }
}
