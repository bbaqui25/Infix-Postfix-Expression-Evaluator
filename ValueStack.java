import java.io.*;

public class ValueStack
{
	private class Node
	{
		private int value;
		private Node next;
	}
	
	private Node head;

	public ValueStack()
	{
		Node head = null;
	}	

	public boolean isEmpty()
	{
		return head == null;
	}

	public void push(int value)
	{
		Node temp = head;
		head = new Node();
		head.value = value;
		head.next = temp;
	}

	public int top()
	{
		if(!isEmpty())
			return head.value;
		return -999;
	}

	public void pop()
	{
		head = head.next;
	}

	public int topPop()
	{
		int temp = this.top();
		this.pop();
		return temp;
	}

}