import java.util.Scanner;

class Ques27 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter 5 Elements of Array : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int smallEle = arr[0], bigEle = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (smallEle > arr[i]) {
				smallEle = arr[i];
			} else if (bigEle < arr[i]) {
				bigEle = arr[i];
			} else {
				continue;
			}
		}
		System.out.print("Array :   ");
		for (int a : arr) {
			System.out.print(" " + a);
		}
		System.out.println("\nSmallest Element in Array :  " + smallEle);
		System.out.println("Greatest Element in Array :  " + bigEle);
		sc.close();
	}
}