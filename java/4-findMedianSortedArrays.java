//Hard
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int a[] = new int[nums1.length + nums2.length];
        if(nums1.length>0){for(int i=0;i<nums1.length;i++){
            a[i] = nums1[i];
          
        }}
        System.out.println(Arrays.toString(a));
        if(nums2.length>0)for(int j=0;j<nums2.length;j++){
            if(nums1.length>0) a[j+nums1.length] = nums2[j];
            else a[j] = nums2[j];
        }
        Arrays.sort(a);
        if(a.length%2!=0) return a[a.length/2];

        return (double)(a[a.length/2] + a[a.length/2 - 1])/2;
         
        
    }
}
