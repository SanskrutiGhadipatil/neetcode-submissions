class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> grid = new ArrayList<>();

        for(int i=0;i<numCourses;i++){
            grid.add(new ArrayList<>());
        }
        int[] indegree = new int[numCourses];
        //b->a
        for(int[] arr : prerequisites){
            int a = arr[0];
            int b= arr[1];

            grid.get(b).add(a);

            indegree[a]++;
        }

        Queue<Integer>  que= new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if (indegree[i]==0) {
                que.offer(i);
            }
        }
        int completed=0;
        while(!que.isEmpty()){
            int val=que.poll();
            completed++;
            for(int i : grid.get(val)){
                indegree[i]--;
                if(indegree[i]==0){
                    que.offer(i);
                }
            }
        }
        return completed == numCourses;
    }
}
