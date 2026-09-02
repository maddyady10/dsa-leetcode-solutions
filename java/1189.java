// Easy

class Solution {
    public int maxNumberOfBalloons(String text) {

        char[] arr = new char[26];
        for(char c : text.toCharArray()){
            arr[c-'a']++;
        }
        int ans = arr[14]/2;
        ans = Math.min(ans,arr[1]);
        ans = Math.min(ans,arr[0]);
        ans = Math.min(ans,arr[11]/2);
        ans = Math.min(ans,arr[13]);

        return ans;
        
        
        
    }
}
