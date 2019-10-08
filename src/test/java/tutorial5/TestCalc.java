package tutorial5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalc {
int a=3,b=4;
	@Test
	void test() {
		assertTrue(Calc.add(a, b)==7);
	}

}
