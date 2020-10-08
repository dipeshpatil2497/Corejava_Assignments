import java.util.Scanner ;
import java.util.Arrays;
class Ques22 {
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
		Arrays.sort(arr);
		 System.out.println();
		for (int i = 9 ; i >= 0 ; i--){
			 System.out.print(arr[i]+" ");		  
		}
		
	} 
}