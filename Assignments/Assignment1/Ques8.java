import java.util.Scanner ;
class Ques8{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Simple Interest");
		System.out.println("Enter Principle , Rate , time : ");
		int principle =  sc.nextInt();
		float rate = sc.nextFloat();
		int time = sc.nextInt();

	            	float si = (principle*rate*time/100);
            		System.out.println("Simple intrest is : "+si);	
	}
}