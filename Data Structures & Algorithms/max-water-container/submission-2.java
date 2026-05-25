class Solution {
    public int maxArea(int[] heights) {
        int max =0;
        //area=l*b len
        for(int i=0;i<heights.length;i++){
            for(int j=i+1;j<heights.length;j++){
                int area=
                 Math.min(heights[i],heights[j])*(j-i);
                max=Math.max(area,max);
            }
        }
        return max;
    }
}
