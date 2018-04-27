import java.io.*;

public class OperatorStack
{
	private class Node
	{
		private char value;
		private Node next;
	}

	private Node head;

	public OperatorStack()
	{
		Node head = null;
	}

	public boolean isEmpty()
	{
		return head == null;
	}

	public void push(char value)
	{
		Node temp = head;
		head = new Node();
		head.value = value;
		head.next = temp;
	}

	public char top()
	{
		return head.value;
	}

	public void pop()
	{
		head = head.next;
	}

	public char topPop()
	{
		char temp = this.top();
		this.pop();
		return temp;
	}
}