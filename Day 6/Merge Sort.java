public class Solution {

	public static void divide(int []arr,int left,int right){
		if(left>=right){
			return;
		}
		int mid=left+(right-left)/2;
		divide(arr,left,mid);
		divide(arr,mid+1,right);
		merge(arr,left,right);
	}

	public static void merge(int[] arr,int left,int right){
		int mid=left+(right-left)/2;
		int len1=mid-left +1;
		int len2=right-mid;
		int arr1[]=new int[len1];
		int arr2[]=new int[len2];
		int k=left;
		for(int i=0;i<len1;i++){
			arr1[i]=arr[k];
			k++;
		}
		k=mid+1;
		for(int i=0;i<len2;i++){
			arr2[i]=arr[k];
			k++;
		}
		k=left;
		int index1=0;
		int index2=0;
		while(index1<len1 && index2<len2){
			if(arr1[index1]<arr2[index2]){
				arr[k]=arr1[index1];
				index1++;
			}
			else{
				arr[k]=arr2[index2];
				index2++;
			}
			k++;
		}
		while(index1<len1){
			arr[k]=arr1[index1];
			index1++;
			k++;
		}
		while(index2<len2){
			arr[k]=arr2[index2];
			index2++;
			k++;
		}
	}
	public static void mergeSort(int[] arr, int n) {
		divide(arr,0,n-1);
	}
}