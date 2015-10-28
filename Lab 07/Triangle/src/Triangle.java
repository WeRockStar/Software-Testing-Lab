
public class Triangle {
	public static String isTriangle(int a, int b, int c) {
		String isTria = "";
		if ((a < b + c) && (b < a + c) & (c < a + b)) {
			if (a == b && b == c) {
				isTria = "Equilateral";
			} else if ((a != b) && (a != c) && (b != c)) {
				isTria = "Scalene";
			} else {
				isTria = "Isosceles";
			}
		}else {
			isTria = "Not a Triangle";
		}
		return isTria;
	}
}
