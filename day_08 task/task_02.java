package day_08;
import java.util.Arrays;
import java.util.Scanner;
public class task_02 {
public static void main(String[] args)
{
	int[] arr= {34,45,2,65,78,1,9};
	System.out.println(Arrays.toString(arr));
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value to be found");
	int n=sc.nextInt();
	int left=0;
	int right=arr.length-1;
	int mid;
	boolean flag=true;
	while(left<=right)
	{
		mid=(left+right)/2;
		if(arr[mid]==n)
		{
			System.out.println("Value found"+arr[mid]+"at index"+mid);
			flag=true;
			break;
		}
		else if(n>arr[mid])
		{
			left=mid+1;
		}
		else if(n<arr[mid])
		{
			right=mid-1;
		}
		
	}
	if(flag==false) {
		System.out.println("Value not found");
	}	
}
}

