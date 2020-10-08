import java.util.Scanner;

class Employee{
    int empID;
    String empName;
    double salary;

    Employee(int empID , String empName , double salary){
        this.empID=empID;
        this.empName=empName;
        this.salary=salary;
    }

    public String toString(){
        return empID+" "+empName+" "+salary;
    }

    public boolean equals(Object obj) {
		if(obj == null)
			return false;
		if(obj instanceof Employee) {
			Employee e = (Employee)obj;
			return empId == e.empId;
		}
		return false;
	}
}
class Ques50{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee arr[] = new Employee[5];
        for(int i=0; i<arr.length; i++){
            System.out.println("Enter empID : ");
            int empID = sc.nextInt();
            System.out.println("Enter empName : ");
            String empName = sc.next();
            System.out.println("Enter Salary : ");
            double salary = sc.nextDouble();
            if(i>0){
                for(int j=0; j<i ; j++){
                    Employee e = new Employee(empID,empName,salary);
                    arr[i] = e;
                    if(arr[i].equals(arr[j])){
                        System.out.println("empID repeatation are not allowed");
                        i--;
                    }
                }
            }else{
                Employee e = new Employee(empID,empName,salary);
                arr[i] = e;
            }

        }
        sc.close();
    }
}