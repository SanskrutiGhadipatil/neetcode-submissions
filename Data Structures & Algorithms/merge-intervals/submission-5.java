class Solution {
    public int[][] merge(int[][] intervals) {
       Arrays.sort(intervals , (a,b)->a[0]-b[0]);
       int[] current=intervals[0];
       List<int[]> res=new ArrayList<>();
       
       for(int i=1;i<intervals.length;i++){

           if(intervals[i][0]<=current[1]){
            current[1]=Math.max(intervals[i][1],current[1]);
           }else{
            //add to list as it is
              res.add(current);
              current=intervals[i];
           }
       }
       res.add(current);
       return res.toArray(new int[res.size()][]);

    }
}
