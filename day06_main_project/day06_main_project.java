package day06_main_project;

import java.util.Arrays;
public class day06_main_project{
	int[]arr=new int[5];
	int rear;
	int front;
	public day06_main_project() {
		rear=-1;
		front=-1;
	}
	public void enqueue(int num)
	{
		if(rear==4)
		{
			System.out.println("Queue spreadout");}
			else {
				arr[++rear]=num;
			}
		}
		public void dequeue()
		{
			if(front==4) {
				System.out.println("Empty Queue");
			}
			else {
				arr[++front]=0;
			}
		}
		public void display()
		{
			System.out.println("The queue operations is :"+ Arrays.toString(arr));
		}
		public static void main(String[]args)
		{
			day06_main_project q1=new day06_main_project ();
			q1.enqueue(23);
			q1.enqueue(30);
			q1.enqueue(56);
			q1.enqueue(40);
			q1.display();
			q1.dequeue();
			q1.display();
		}
	
	}


