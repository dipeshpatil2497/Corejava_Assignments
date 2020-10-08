import java.util.Scanner;
class Ques12{
	public static void main(String args[]){
    		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter your Salary : ");
    		float f = sc.nextFloat();
    		float hra=0;
    		float da=0;
    		if ( f<10000)
		{
        			hra = 10*f/100;
        			da = 90*f/100;
    		}
    		else if( f >= 10000)
		{
        			hra = 20000;
        			da = 98*f/100;
    		}
		float gs = f+hra+da;
    		System.out.println("Gross Salary : "+gs);
		}
	}