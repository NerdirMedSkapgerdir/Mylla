package is.ru.Mylla;

import static org.junit.Assert.*;
import org.junit.*;

public class MylluTest {

	@Test
	public void testGreet() {
		assertEquals("Halló heimur", Mylla.main());
	}

}
