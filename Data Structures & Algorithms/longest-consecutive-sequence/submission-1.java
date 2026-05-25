class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        if(nums.length<=1){
            return nums.length;
        }
        for(int num:nums){
            set.add(num);
        }
        int maxCount=0;
        for(int num :set){
            if(set.contains(num-1)){
                int val=num+1;
                int count=1;
                while(set.contains(val)){
                    count++; 
                    val++;               
                }
                maxCount=Math.max(count,maxCount);
            }
        }
        return maxCount+1;
    }
}
