class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq1=new int[26];
        int[] freq2=new int[26];

        for(int i=0;i<s.length();i++){
            int index=s.charAt(i)-'a';
            freq1[index]++;
        }
        for(int i=0;i<t.length();i++){
            int index=t.charAt(i)-'a';
            freq2[index]++;
        }
        return Arrays.equals(freq1,freq2);
    }
}
