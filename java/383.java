//Easy
class Solution {
    public boolean canConstruct(String r, String m) {

        int[] arr = new int[26];
        for(char c : r.toCharArray()){
            arr[c-'a']++;

        }
        for(char c : m.toCharArray()){
            if(arr[c-'a']>0){
                arr[c-'a']--; 
            }
        }

        for(int i=0;i<26;i++){
            if(arr[i]!=0) return false;
        }

        return true;


        
    }
}
