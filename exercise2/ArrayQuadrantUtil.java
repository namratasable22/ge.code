package com.ge.exercise2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayQuadrantUtil {
   //private static final Logger logger = LogManager.getLogger(ArrayQuadrantUtil.class);

    char[][] data;

    public ArrayQuadrantUtil(char[][] data) {
        this.data = data;
    }

    public static Object[] printQuadrant (char[][] a, int m, int n) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0)
					System.out.print(a[i][j] + " ");
				else if (i == m - 1)
					System.out.print(a[i][j] + " ");
				else if (j == 0)
					System.out.print(a[i][j] + " ");
				else if (j == n - 1)
					System.out.print(a[i][j] + " ");
				else
					System.out.print("  ");
			}
			System.out.println("");
		}
		return a;
	}
		public static Object[] printColumn(char[][] a, int m) {
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < m; j++) {
					 if (j == 0)
						System.out.print(a[i][j] + " ");					
				}
				System.out.println("");
			}
			return a;
		}
		
		public static Object[] printRow(char[][] a, int n) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i == 0)
						System.out.print(a[i][j] + " ");
			}
				System.out.println("");
			}
			return a;
		}
	

	/* Driver program to test above function */
	public static void main(String[] args) {
		char a[][] = { { 'a', 'b', 'c', 'd' }, { 'e', 'f', 'g', 'h' }, { 'i', 'j', 'k', 'l' }, { 'm', 'o', 'p', 'q' } };

		printQuadrant(a, 2, 2);
		printColumn(a, 4);
		printRow(a,4);
	}

}
