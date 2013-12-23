package test;

import first.Cow;
import junit.framework.TestCase;

public class CowTest extends TestCase{
	public void testCow(){
		Cow c = new Cow();
		c.setWeight(300.0f);
		assertEquals(300.0f, c.getWeight());
	}
}
