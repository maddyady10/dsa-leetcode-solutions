//Easy
class Solution {
    public int maxProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int n = nums.length;

        for(int i=0;i<n;i++){
            int cur = nums[i];
            if(cur > max1){
                max2 = max1;
                max1 = cur;
            }
            else if(cur > max2){
                max2 = cur;
            }
        }

        return (max1-1) * (max2-1);
    }
}
