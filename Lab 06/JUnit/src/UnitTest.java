import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTest {

	@Test
	public void pathTesting() { // test a typical value in pt
		assertEquals('A', Grade.getLetterGrade(95));
		assertEquals('B', Grade.getLetterGrade(72));
		assertEquals('C', Grade.getLetterGrade(55));
		assertEquals('C', Grade.getLetterGrade(53));
		assertEquals('F', Grade.getLetterGrade(20));
	}

	@Test
	public void TestEC() {
		assertEquals('A', Grade.getLetterGrade(100));
		assertEquals('A', Grade.getLetterGrade(75));
		assertEquals('B', Grade.getLetterGrade(74));
		assertEquals('B', Grade.getLetterGrade(60));
		assertEquals('C', Grade.getLetterGrade(59));
		assertEquals('C', Grade.getLetterGrade(54));
		assertEquals('D', Grade.getLetterGrade(49));
		assertEquals('D', Grade.getLetterGrade(30));
		assertEquals('F', Grade.getLetterGrade(29));
		assertEquals('F', Grade.getLetterGrade(0));

	}
}
