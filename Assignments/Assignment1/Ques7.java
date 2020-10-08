import java.util.Scanner ;
class Ques7{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Marksheet of 5 Subject");
		System.out.println("Enter Marks of 5 Subject : ");
		int Sub1 =  sc.nextInt();
		int Sub2 =  sc.nextInt();
		int Sub3 =  sc.nextInt();
		int Sub4 =  sc.nextInt();
		int Sub5 =  sc.nextInt();
		double Total ;
		double Percentage ;
		Total = Sub1 + Sub2 + Sub3 + Sub4 + Sub5 ;
		Percentage =  (Total *100)/ 500 ;
		System.out.println("Percentage = "+Percentage+" %");
	}
}