package dcll.npri.MySimpleStack;

import junit.framework.Assert;
import junit.framework.TestCase;

public class ItemTest extends TestCase {

	private Item i;
	
	public void setup() {
		// TODO Auto-generated constructor stub
		this.i = new Item(5);
	}
	
	public void test()
	{
		Assert.assertEquals(5,this.i.getValue());
		this.i.setValue(8);
		Assert.assertEquals(8,this.i.getValue());
	}
	
}
