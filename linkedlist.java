import java.util.*;
public class linkedlist 
{
	Node head;
	static int n;
	static class Node
	{
		int data;
		Node next;
		Node(int x)
		{
			data=x;
			next=null;
		}
	}
	static linkedlist insertAtEnd(linkedlist list , int data)
	{
		Node new_n=new Node(data);
		if(list.head==null)
		{
			list.head=new_n;
		}
		else
		{
			Node n1=list.head;
			while(n1.next!=null)
			{
				n1=n1.next;
			}
			n1.next=new_n;
		}
		return list;
	}
	static void printlist(linkedlist list)
	{
		Node n2=list.head;
		while(n2!=null)
		{
			System.out.println(n2.data+" "+n2.next);
			n2=n2.next;
		}
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		linkedlist list=new linkedlist();
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			list=insertAtEnd(list,s.nextInt());
		}
		printlist(list);
	}
}