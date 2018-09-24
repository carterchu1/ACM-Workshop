import java.util.*;
public class Skener {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int nr = sc.nextInt();
		int nc = sc.nextInt();
		char [][] ori = new char[r][c];
		for (int i = 0; i < r; i++) {
			String temp = sc.next();
			for (int k = 0; k < c; k++)
				ori[i][k] = temp.charAt(k);
		}
		char [][] big = new char[nr * r][nc * c];
		for (int i = 0; i < nr*r; i++) {
			for (int j = 0; j < nc*c; j++) {
				System.out.print(ori[i/nr][j/nc] + "");
			}
			System.out.println();
		}
		
	}
}
