import java.util.*;
public class linkedlist1 
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
	static linkedlist1 insert(linkedlist1 list , int data)
	{
		Node n1=new Node(data);
		if(list.head==null)
		{
			list.head=n1;
		}
		else		
		{
			Node n2=list.head;
			while(n2.next!=null)
			{
				n2=n2.next;
			}
			n2.next=n1;
		}
		return list;
	}
	static linkedlist1 insertafternode(linkedlist1 list , int index , int data)
	{
		Node n4=new Node(data);
		Node n5=list.head;
		for(int i=1;i<=n;i++)
		{
			if(i==index)
			{
				n4.next=n5.next;
				n5.next=n4;
			}
			n5=n5.next;
		}
		return list;
	}
	static void printlist(linkedlist1 list)
	{
		
	Node n3=list.head;
	while(n3!=null)
	{
		System.out.println(n3.data+" "+n3.next);
		n3=n3.next;
	}
	}
	public static void main(String[] args) 
	{
		linkedlist1 list=new linkedlist1();
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
		list=insert(list,s.nextInt());
		}
		list=insertafternode(list,s.nextInt(),s.nextInt()); 
		printlist(list);
	}
}
