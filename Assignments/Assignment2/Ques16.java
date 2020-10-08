import java.util.Scanner ;
class Ques16 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no : ");
		int no = sc.nextInt();
		for (int i=1; i<=10;i++){
			System.out.printf ("%d x %d  =  %d\n",no, i, no*i);
		}	
	} 
}