class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        Set<Integer> s= new HashSet<>();
        for(int i=0;i<n1;i++){
            s.add(nums1[i]);
        }
        for(int i=0;i<n2;i++){
            if(s.contains(nums2[i])){
                return nums2[i];
            }
        }
        return -1;
    }
}