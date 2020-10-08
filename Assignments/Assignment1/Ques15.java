import java.util.Scanner;
class Ques15{
	public static void main(String args[]){
    		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter Your  age and Gender : ");
    		byte age = sc.nextByte();
		char g = sc.next().charAt(0);
		if ( age > 21 && (g == 'm' || g == 'M')){
			System.out.println("Yes , You are eligible for marriage");
		}
		else if (age > 18 && ( g  == 'f' || g == 'F')) {
			System.out.println("Yes , You are eligible for marriage");	
		}
		else {
			System.out.println("Sorry ,  You are not eligible for marriage ");	
		}		 		
	}
}				