// Easy
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int max = 0;
        for(String w : patterns){
            if(word.contains(w)) max++;
        }

        return max;
        
    }
}
