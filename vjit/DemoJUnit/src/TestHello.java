import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.TestCase;

public class TestHello{
	@Test
	public void testsay()
	{
		Hello h=new Hello();
		assertEquals("Hello World!",h.say());
	}
	
}
