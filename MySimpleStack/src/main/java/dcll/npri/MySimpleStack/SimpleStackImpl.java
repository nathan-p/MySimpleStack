package dcll.npri.MySimpleStack;

import java.util.EmptyStackException;
import java.util.Stack;

public class SimpleStackImpl implements SimpleStack {
	Stack<Object> wrappedStack = new Stack <Object>();
	
	
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.wrappedStack.isEmpty();
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return this.wrappedStack.size();
	}

	@Override
	public void push(Item item) {
		// TODO Auto-generated method stub
		this.wrappedStack.push(item);
	}

	@Override
	public Item peek() throws EmptyStackException {
		// TODO Auto-generated method stub
		return (Item) this.wrappedStack.peek();
	}

	@Override
	public Item pop() throws EmptyStackException {
		// TODO Auto-generated method stub
		return (Item)this.wrappedStack.pop();
	}

}
