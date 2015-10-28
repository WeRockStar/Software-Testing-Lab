
public class Commission {
	public static double Calculate(double lock, double stock, double barrel) {
		double sale = (45 * lock) + (30 * stock) + (25 * barrel);
		if (sale < 1000.0) {
			return (sale * 0.10);
		} else if (sale >= 1000.0 || sale > 1800.0) {
			return (double) (0.15 * (sale - 1000)) + (1000 * 0.10);
		} 
		return 0.0;

	}

}
