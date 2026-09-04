//Easy

class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int n = nums.length;

        int[] min = new int[n+1];
        int[] max = new int[n+1];
        int ans = Integer.MAX_VALUE;
        max[0] = 0;
        min[n] = Integer.MAX_VALUE;

        for(int i=1;i<=n;i++){
            max[i] = Math.max(max[i-1] , nums[i-1]);
            min[n-i] = Math.min(nums[n-i],min[n+1-i]);
        }
        int idx = -1;

        for(int i=1;i<=n;i++){
            int t = max[i]-min[i-1];
            if(max[i]-min[i-1] <= k ){
                if(ans>t){
                    ans = t;
                    idx = i-1;
                    return idx;
                    
                }
            }
        }
    //     System.out.println(Arrays.toString(max));
    //    System.out.println(Arrays.toString(min));
        return idx;
        
    }
}
