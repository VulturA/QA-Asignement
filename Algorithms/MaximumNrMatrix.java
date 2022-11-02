// Bellow we have a matrix and we must print the maximum value from that matrix

package coreJava;

public class MaximumNrMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[3][3];
		a[0][0] = 4;
		a[0][1] = 8;
		a[0][2] = 100;
		a[1][0] = 12;
		a[1][1] = 3;
		a[1][2] = 1;
		a[2][0] = 3;
		a[2][1] = 5;
		a[2][2] = 6;

		// First we assign to a variable named max the value of the first element of the
		// matrix, 4 in our case
		int max = a[0][0];

		// The first for is for the rows, we start from the first element a[0][0], then
		// a[0][1] a[0][2]
		for (int i = 0; i <= 2; i++) { // row
			// System.out.println(i);

			// the second for is for the columns, we start with j having 0 value, until j
			// reaches 2

			for (int j = 0; j <= 2; j++) { // column

				// We check in the second iteration each value from the first row. If the
				// values are greater than the value of the first element(max), the max variable
				// will take that
				// value. At the end of the iteration max will have the value 100
				// For the next iteration we compare 100 with 12, 13, 1. The condition is not
				// validated because a[i][j] is not greater than 100
				// We check for the third row and we don't have a match, 100 rests the higher
				// number
				if (a[i][j] > max) {

					max = a[i][j];

					System.out.println("test");
				}

			}

		}
		System.out.println(max);
	}

}
