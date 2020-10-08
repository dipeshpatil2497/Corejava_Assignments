class Ques26 {
	public static void main(String args[]) {
		int ar0[] = { 10, 11, 12, 13 };
		int ar1[] = { 20, 21, 22, 23, 24 };
		int ar2[] = { 30, 31, 32, 33 };
		int ar3[] = { 40, 41, 42 };
		int ar4[] = { 50 };

		int arr[][] = new int[5][];
		arr[0] = ar0;
		arr[1] = ar1;
		arr[2] = ar2;
		arr[3] = ar3;
		arr[4] = ar4;

		for (int a[] : arr) {
			for (int b : a) {
				System.out.print("  " + b);
			}
			System.out.println();
		}

		/*
		 * for (int i = 0; i<arr.length;i++){ for (int j =0;j<arr[i].length;j++){
		 * System.out.print("  "+arr[i][j]); } System.out.println(); }
		 */
	}
}