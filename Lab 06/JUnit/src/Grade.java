
public class Grade {
	public static void main(String[] args) {
		System.out.println(getLetterGrade(70));
	}

	public static char getLetterGrade(int mark) {
		if (mark >= 75) {
			return 'A';
		} else if (mark >= 60) {
			return 'B';
		} else if (mark > 50) {
			return 'C';
		} else if (mark >= 30) {
			return 'D';
		} else {
			return 'F';
		}
	}

}
