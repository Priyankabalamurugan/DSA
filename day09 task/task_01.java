package day_09;
public class task_01 {
public static void main(String[]args) {
	int arr[]= {2,3,4,5,12,24,35,77};
	int target=15;
	int left=0;
	int right=arr.length;
	int mid;
	while(left<right)
	{
		mid=(left+right)/2;
		if(arr[mid]<target)
		{
			left=mid+1; 
		}
		else if(arr[mid]>=target) {
			right=mid;
		}}
		try {
			if(((arr[left]|arr[right]))>=target) {
				System.out.println("Low bound found at "+left+" the index "+right);
			}
			else if(target>(arr[left]|arr[right])) {
				System.out.println("out of bounds");
			}
			}
		catch(Exception e) {
			System.out.println("out of bounds,no low d!!!");
		}}}
		
	
	