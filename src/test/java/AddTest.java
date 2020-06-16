import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	Jenkins obj =new Jenkins();
	
	@Test
	public void test() {
		assertEquals(100,  obj.add(50, 50));
	}

}
