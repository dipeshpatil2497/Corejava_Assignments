import java.util.Scanner;
class Ques13{
	public static void main(String args[]){
    		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter 3 No's : ");
    		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		if (n1 > n2 && n1 > n3){
			System.out.println(n1+"  is greatest no.");
		}
		else if (n2 > n1 && n2 > n3){
			System.out.println(n2+"  is greatest no.");	
		}
		else{
			System.out.println(n3+"  is greatest no.");
		}
		System.out.println("Using Ternery Operator : ");
		int g = (n1 > n2)?( (n1>n3 ? n1 : n3) ):( (n2 > n3) ? n2 : n3);
            		System.out.println(g+"Gretest Number : "); 		
	}
}