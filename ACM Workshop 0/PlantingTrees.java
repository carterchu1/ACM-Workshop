import java.util.*;
public class PlantingTrees {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] trees = new int[n];
		for (int i = 0; i < n; i++)
			trees[i] = sc.nextInt();
		Arrays.sort(trees);
		int max = 0;
		for (int i = 0; i < n; i++)
			if (max < trees[i] + n + 1 - i)
				max = trees[i] + n + 1 - i;
		System.out.print(max);
	}

}
