import java.util.Scanner;

class Ques30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter cols for " + i);
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("enter ele");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("=======================");
        System.out.println("Array : ");
        for (int a[] : arr) {
            for (int b : a) {
                System.out.print(" " + b);
            }
            System.out.println();
        }
        System.out.println("=======================");
        System.out.print("Addition of diagonal element : ");
        int count = 0, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (count == j && i == count) {
                    sum = sum + arr[i][j];
                    count++;
                } else {
                    continue;
                }
            }
        }
        System.out.println(" " + sum);
        sc.close();
    }
}