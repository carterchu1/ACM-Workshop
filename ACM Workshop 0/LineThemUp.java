import java.util.*;
public class LineThemUp {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] strs = new String[num];
		for (int n = 0; n < num; n++) {
			strs[n] = sc.next();
		}
		String[] temp = new String[num];
		for (int i = 0; i < num; i++)
			temp[i] = strs[i];
		Arrays.sort(temp);
		boolean inc = true;
		for (int i = 0; i < num; i++) {
			if (!temp[i].equals(strs[i]))
				inc = false;
		}
		if (inc)
			System.out.println("INCREASING");
		boolean dec = true;
		for (int i = 0; i < num; i++) {
			if (!temp[i].equals(strs[num-i-1]))
				dec = false;
		}
		if (dec)
			System.out.println("DECREASING");
		if (!dec && !inc)
			System.out.println("NEITHER");
		
	}

}
