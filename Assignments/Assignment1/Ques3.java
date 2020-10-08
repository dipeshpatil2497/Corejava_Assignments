class Ques3{
	public static void main(String args[]){
		int x = 10;
		int y , z ;
		boolean a ;
		boolean  b = true;
		boolean c = false ;
		System.out.println("A Condition :"); 
		y = (x*x)+(3*x)-7;
		System.out.println("Value of y = "+y);
		System.out.println("B Condition : ");
		y = x++ + ++x ;
		System.out.println("Value of x = "+x);
		System.out.println("Value of y = "+y);
		System.out.println("C Condition : ");
		 z = x++ - --y - --x + x++ ;
		System.out.println("Value of x = "+x);
		System.out.println("Value of y = "+y);
		System.out.println("Value of z = "+z);
		System.out.println("D Condition : ");
		a  = b && c || !(b || c);
		System.out.println("Value of x = "+x);
		System.out.println("Value of y = "+y);
		System.out.println("Value of a = "+a);
	}
}