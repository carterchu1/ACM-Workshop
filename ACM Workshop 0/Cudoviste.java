import java.util.*;
public class Cudoviste {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		char [][] park = new char[r][c];
		for (int i = 0; i < r; i++) {
			String temp = sc.next();
			for (int k = 0; k < c; k++)
				park[i][k] = temp.charAt(k);
		}
		int[] counts = new int[5];
		for (int i = 0; i < r - 1; i++) {
			for (int j = 0; j < c - 1; j++) {
				int count = 0;
				if (park[i][j]!='#' && park[i+1][j]!='#' && park[i][j+1]!='#' && park[i+1][j+1]!='#') {
					if (park[i][j]=='X')
						count++;
					if (park[i+1][j]=='X')
						count++;
					if (park[i][j+1]=='X')
						count++;
					if (park[i+1][j+1]=='X')
						count++;
					counts[count]++;
				}
			}
		}
		for (int i = 0; i < 5; i++)
			System.out.println(counts[i]);
	}

}
