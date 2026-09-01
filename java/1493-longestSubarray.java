//Medium
class Solution {
    public int longestSubarray(int[] a) {
        int n = a.length;
        int l = 0;
        int c = 0;
        int max = 0;
        for(int r=0;r<n;r++){
            if(a[r] == 0){
                c++;
            }
            while(c>1){
                if(a[l] == 0){
                    c--;
                }
                l++;
            }
            max = r-l > max ? r-l : max;

        }
        return max;
        
    }
}
