import java.util.Scanner ;
class Ques25 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [5] ;
		int Sum = 0;
		for (int i = 0; i < arr.length ; i++){
			 System.out.println("Enter  value : ");
			 arr [i] = sc.nextInt(); 
		}
		for (int a : arr){
			System.out.print(a+" ");
		}
		 System.out.println();
		int evenSum = 0 , oddSum = 0;
		for (int i = 0 ; i < arr.length ; i++){
			if (arr[i]%2==0){
				evenSum += arr[i];
			}
			else{
				oddSum += arr[i];
			}			  
		}
		System.out.println("Sum of All EVEN Elements : "+evenSum);		
		System.out.println("Sum of All ODD Elements : "+oddSum);
	} 
}