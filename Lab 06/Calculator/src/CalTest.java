import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalTest {
	Calculator cal;

	@Before
	public void setUp() throws Exception {
		cal = new Calculator();
	}

	@Test
	public void ptCal1() {
		assertEquals(30.475, cal.calculate(10, "yes"), 0);
	}

	@Test
	public void ptCal2() {
		assertEquals(15.975, cal.calculate(10, "no"), 0);
	}

	@Test
	public void ptCal3() {
		assertEquals(1698.75, cal.calculate(1500, "no"), 0);
	}

	@Test
	public void ptCal4() {
		assertEquals(345.75, cal.calculate(300, "no"), 0);
	}

	@Test
	public void ptCal5() {
		assertEquals(174.125, cal.calculate(150, "no"), 0);
	}

	@Test
	public void ptCal6() {
		assertEquals(90.3875, cal.calculate(75, "no"), 0);
	}

	@Test
	public void ptCal7() {
		assertEquals(39.425, cal.calculate(30, "no"), 0);
	}
}
