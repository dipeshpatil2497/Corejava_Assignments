import java.util.Scanner;

class Ques29 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[5];
		System.out.println("Enter 5 Elements of Array : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		System.out.print("Array :   ");
		for (String a : arr) {
			System.out.print(" " + a);
		}
		sc.close();
	}
}