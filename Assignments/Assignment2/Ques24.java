import java.util.Scanner ;
class Ques24 {
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
		System.out.println("Enter which no you want to serach : ");
		int no = sc.nextInt();
		int size = arr.length;
		int flag = -1;
		for (int i = 4 ; i >= 0 ; i--){
			if (arr[i] == no){
				flag = i;
				break;
			} else{
				continue;
			}			  
		}
		if (flag >= 0){
			System.out.println("WoW......!!! ");
			System.out.print(no+" is Present in Array at "+flag+" Position");
		}
		else {
			System.out.print(no+" is Not Present in Array");
		}
			
	} 
}