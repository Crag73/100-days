class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<int[]>pq=new PriorityQueue<>(new Comparator<>(){
            public int compare(int[] a,int[]b){
                double ar=(double)(a[0])/a[1];
                double br=(double)(b[0])/b[1];
                if(ar>br){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        });
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                pq.add(new int[]{arr[i],arr[j]});
            }
        }
        while(--k!=0){
            pq.remove();
        }
        return pq.peek();
    }
}