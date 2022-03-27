package assingn;

public class Unique_elements_2d_array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { { 2, 3, 4 }, { 4, 5, 2 }, { 4, 8, 2 } };
		String unique = "";
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {
				if (!unique.contains(a[i][j] + "")) {
					unique = unique + a[i][j] + " ";
				}
			}
		}

		System.out.println("Unique elements:: " + unique);
	}
}
