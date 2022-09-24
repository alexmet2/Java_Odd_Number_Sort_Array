import java.util.Arrays;
import java.util.Scanner;

public class Java_Odd_Number_Sort_Array {

	public static void main(String[] args) {
		int[] num1 = new int[10];
		int a = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input 10 numbers: ");
		for(int i=0;i<num1.length;i++) {
			System.out.println("Position " + a + ": ");
			num1[i]=scan.nextInt();
			a++;
		}
		System.out.println("Normal: ");
		for(int in1=0;in1<num1.length;in1++) {
			System.out.print(num1[in1] + " ");
		}
		System.out.println();
		System.out.println("Only odd numbers without sort: ");
		for(int in2=0;in2<num1.length;in2++) {
			if (num1[in2] %2 == 1) {
				System.out.print(num1[in2] + " ");
			}
		}
		System.out.println();
		Arrays.sort(num1);
		System.out.println("Only odd numbers with sort: ");
		for(int in3=0;in3<num1.length;in3++) {
			if (num1[in3] %2 == 1) {
				System.out.print(num1[in3] + " ");
			}
		}
		scan.close();
	}

}