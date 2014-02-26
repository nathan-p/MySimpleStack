package dcll.npri.MySimpleStack;

import org.junit.Test;

import org.junit.Assert;
import junit.framework.TestCase;


public class SimpleTaskImplTest extends TestCase 
{

	
	SimpleStack simpleStack ;
	
	public void setup()
	{
		simpleStack = new SimpleStackImpl();
	}
	
	public void test(){
		Assert.assertEquals(true,this.simpleStack.isEmpty());
		simpleStack.push(new Item("toto"));
		Assert.assertEquals(false,this.simpleStack.isEmpty());
		simpleStack.push(new Item(9));
		Assert.assertEquals(2,simpleStack.getSize());
		Assert.assertEquals(9,simpleStack.peek().getValue());
		Assert.assertEquals(2,simpleStack.getSize());
		Assert.assertEquals(9,simpleStack.pop().getValue());
		Assert.assertEquals(1,simpleStack.getSize());
	}
}
