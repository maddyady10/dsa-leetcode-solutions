//Easy

class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int[] c = new int[26];
        int l = 0;
        int max = 0;

        for(int i=0;i<n;i++){
            int ch = s.charAt(i) - 'a';
            c[ch]++;
            while(c[ch] > 2){
                c[s.charAt(l) - 'a']--;
                l++;
            }

            max = Math.max(max,i-l+1);
        }

        return max;
        
    }
}
