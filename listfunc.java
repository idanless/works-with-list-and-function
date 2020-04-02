package homework;
import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num ;
		System.out.println("number will be in end of the list");
		num = input.nextInt();
		
	//make a list max 5
		
		int [] arr = { 23, 5, 78, 34, 2};
		read(arr, num);
		


	}
//func got the arr
	public static int [] read(int [] num,int num1)
	
	{	int [] numbers = new int[num.length+1];
		System.out.print("original list"+"\n");
		System.out.print("[");
		//for on arr and put last number on index 6
		for (int i=0; i<num.length;i++) {
			numbers[i]+=num[i];
			numbers[i+1]=num1;
			System.out.print(numbers[i]+" ");

		}
		System.out.print("]");
		
		output(numbers);
		return numbers;
		
	}
	
	public static int [] output(int [] num) {
		System.out.println("\n"+"output with my number");
		System.out.print("[");
		for (int i=0; i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.print("]");
		return num;
	}
	
	
	
}
