import java.util.Scanner ;
class Ques9{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Days : ");
            		int d = sc.nextInt();
            		int year = d/365;
                		int rem = d%365;
                		int month = rem/30;
                    		int days = rem%30;
            
           		 System.out.println(year +" year "+month+" month "+days+" days ");	
	}
}