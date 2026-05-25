class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();

        if(digits.length()==0){
            return result;
        }

        String[] map ={
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };
        backtrack(0,digits,new StringBuilder(),result,map);
        return result;
    }
    //2-> abc 4-def
    public void backtrack(int index,String digits,StringBuilder current,
    List<String> result,String[] map){
        if(current.length()==digits.length()){
            result.add(current.toString());
            return;
        }
        int digit =digits.charAt(index)-'0';
        String letters = map[digit];//2->abc//2
        for(char ch : letters.toCharArray()){
            current.append(ch); //a
            backtrack(index+1,digits,current,result,map);
            current.deleteCharAt(current.length()-1);
        }
  //curr->ad,
    }
}
