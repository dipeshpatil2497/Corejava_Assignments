import java.util.Scanner ;
class Ques21 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [10] ;
		int Sum = 0;
		for (int i = 0; i < arr.length ; i++){
			 System.out.println("Enter  value : ");
			 arr [i] = sc.nextInt(); 
		}
		for (int a : arr){
			System.out.print(a+" ");
		}
		for (int i = 0; i < arr.length ; i++){
			 Sum = Sum + arr[i];
		}
		System.out.println();
		System.out.println("Sum of all elements : "+Sum);
		float Avg ;
		Avg = (float) Sum / 10;
 		System.out.printf("Avg of all elements : %.2f", Avg);
	} 
}