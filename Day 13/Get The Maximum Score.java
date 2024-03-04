class Solution {
    public int maxSum(int[] nums1, int[] nums2) {
        long ans=0;
        int i=0;
        int j=0;
        long si=0;
        long sj=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                si+=nums1[i];
                i++;
            }
            else if(nums1[i]>nums2[j]){
                sj+=nums2[j];
                j++;
            }
            else{
                ans+=Math.max(si,sj)+nums1[i];
                si=0;
                sj=0;
                i++;
                j++;
            }
        }
        while(i<nums1.length){
            si+=nums1[i];
            i++;
        }
        while(j<nums2.length){
            sj+=nums2[j];
            j++;
        }
        ans+=Math.max(si,sj);
        return (int)(ans%1000000007);
    }
}