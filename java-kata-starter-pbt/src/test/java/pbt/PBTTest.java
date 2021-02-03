package pbt;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

@RunWith(JUnitQuickcheck.class)
public class PBTTest {

	@Property
	public void basicProperty(int a) {
		assertEquals(0, a - a);
	}

}
