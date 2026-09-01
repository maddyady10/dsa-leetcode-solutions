// Medium

class Solution {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int maxi=0;
        int mini =0;
        int n = nums.length;

        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max = nums[i];
                maxi = i;
            }
            if(nums[i]<min){
                min = nums[i];
                mini = i;
            }
        }
        int ans = 0;

        int x = 0,y=0 ;
        if(mini <= maxi){
            x=mini;
            y=maxi;
        }
        else{
            y=mini;
            x=maxi;
        }
        // System.out.println("x=" + x + " y=  "+y + " "+ n);
        ans = x+1 + (n-y);
        // System.out.println(x+1 + (n-y));
        ans = Math.min(ans,(n-y) + (y-x));
        // System.out.println((n-y+1) + (y-x));
        ans = Math.min(ans,(x+1) + (y-x));
        // System.out.println((x+1) + (y-x));

        return ans;

        
    }
}
