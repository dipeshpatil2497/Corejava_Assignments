//import java.util.Scanner ;
class Ques19 {
	public static void main(String args[]){
		int [] arr = new int [] {12,22,32,42,50};
		int Sum = 0;
		for (int i = 0; i < arr.length ; i++){
			 Sum = Sum + arr[i];
		}
		for (int a : arr){
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("Sum of all elements : "+Sum);	
	} 
}