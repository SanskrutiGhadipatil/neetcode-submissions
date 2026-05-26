class Solution {

    public int leastInterval(char[] tasks, int n) {

        int[] freq = new int[26];

        // count frequency
        for(char ch : tasks){
            freq[ch - 'A']++;
        }

        // max heap
        PriorityQueue<Integer> pq =
            new PriorityQueue<>((a,b) -> b-a);

        for(int f : freq){

            if(f > 0){
                pq.offer(f);
            }
        }

        int time = 0;

        while(!pq.isEmpty()){

            List<Integer> temp = new ArrayList<>();

            int cycle = n + 1;

            // process one block
            while(cycle > 0 && !pq.isEmpty()){

                int curr = pq.poll();

                curr--;

                if(curr > 0){
                    temp.add(curr);
                }

                time++;
                cycle--;
            }

            // re-add remaining frequencies
            for(int remaining : temp){
                pq.offer(remaining);
            }

            // add idle time if needed
            if(!pq.isEmpty()){
                time += cycle;
            }
        }

        return time;
    }
}