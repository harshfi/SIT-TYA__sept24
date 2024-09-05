package Lec_3;

public class PeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,5,6,11,20,6,4,3,2,1};
		System.out.println(peakIndexInMountainArray(a));

	}
	public static int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<arr[mid+1]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return low;
    }

}
