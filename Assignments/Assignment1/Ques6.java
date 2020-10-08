import java.util.Scanner ;
class Ques6{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculate Area and Circumference of Circle");
		System.out.println("Enter Radius of circle : ");
		int radius =  sc.nextInt();
		double area , circum ; 
		float pi = 3.14F; 
		circum = (2*pi*radius);
		area = (pi*radius*radius);
		System.out.printf("Area of circle : %.3f\n",area);
		System.out.printf("Circumference of circle : %.3f",circum); 
	}
}