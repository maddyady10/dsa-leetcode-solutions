//Easy

class Solution {
    public int rearrangeCharacters(String s, String target) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : target.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int[] arr = new int[26];
        for(char c : s.toCharArray()){
            arr[c -'a']++;
        }

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            arr[e.getKey() - 'a']/=e.getValue();
        }
        // System.out.println(Arrays.toString(arr));

        int min = Integer.MAX_VALUE;
        for(char c : target.toCharArray()){
            // System.out.println(arr[c - 'a']);
            min = Math.min(min,arr[c - 'a']);
        }
        // System.out.println(Arrays.toString(arr));

        return min;
        
    }
}
