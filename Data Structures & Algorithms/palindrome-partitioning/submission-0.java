class Solution {
    //aab
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(0,s,result,new ArrayList<>());
        return result;
    }
    //aab
    public void backtrack(int start, String s, List<List<String>> result, List<String> path){
         if(start==s.length()){
            result.add(new ArrayList<>(path));
            return;
         }

         for(int end=start;end<s.length();end++){
            String sub=s.substring(start,end+1); //a
            if(isPalindrome(sub)){
                path.add(sub); //["a"]
                backtrack(end+1,s,result,path); 
                path.remove(path.size()-1); 
            }
         }
    }

    public boolean isPalindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
