import java.util.Scanner ;
class Ques10{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of Fahrenheit : ");
            		float f = sc.nextFloat();
            		float c = (float)(5*(f-32)/9);
            		System.out.printf("Temperature in Celsius :  %.3f",c);
	}
}