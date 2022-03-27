package assingn;

public class Permutation_binary_type {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30 };
		// Find how many permutations are possible for the given array. Its 3 elements. So permutation possible is 2 Power 3 which is 8
		// So we first find the bianary numbers till 8 i.e 0 to 7
		int permutationCount = (int) Math.pow(2, a.length);
		for (int i = 0; i < permutationCount; i++) {
			int binary[] = findBinary(i);
			findPermutationInBinaryForm(a, binary);
			System.out.println("*******");
		}
	}
	private static void findPermutationInBinaryForm(int[] a, int[] binary) {
		for (int i = 0; i < binary.length; i++) {
			int prod = binary[i] * a[i];
			if(prod==0)
			{
				System.out.print( "-"+ " ");
			}
			else
			{
				System.out.print(prod + " ");
			}
		}
		System.out.println();
	}
	private static int[] findBinary(int i) {
		int binary[] = new int[3];
		int counter = 0;
		while (i != 0) {
			int rem = i % 2;
			binary[counter] = rem;
			++counter;
			i = i / 2;
		}
		//need to call reverse of the array as the binary number is always counted from the last one
		return findReverse(binary);
	}
	private static int[] findReverse(int a[]) {
		int rbinary[] = new int[a.length];
		int k = 0;
		for (int j = a.length - 1; j >= 0; j--) {
			rbinary[k] = a[j];
			System.out.print(rbinary[k] + " ");
			k++;
		}
		System.out.println();
		return rbinary;
	}
}
