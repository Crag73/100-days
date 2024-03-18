class Solution {
    public int findMinArrowShots(int[][] points) {
        int ans=1;
        Arrays.sort(points, (a,b) -> Integer.compare(a[1],b[1]));
        int e=points[0][1];
        for(int i=0;i<points.length;i++){
            if(points[i][0]>e){
                ans++;
                e=points[i][1];
            }
        }
        return ans;
    }
}