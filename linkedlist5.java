import java.util.Scanner;
public class linkedlist5 
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
	static linkedlist5 insertAtEnd(linkedlist5 list , int data)
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
	static linkedlist5 combine(linkedlist5 list , linkedlist5 list1)
	{
		if(list.head==null)
		{
			list.head=list1.head;
		}
		else
		{
			Node n3=list.head;
			while(n3.next!=null)
			{
				n3=n3.next;
			}
			n3.next=list1.head;
		}
		return list;
	}
	static void printlist(linkedlist5 list)
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
		linkedlist5 list=new linkedlist5();
		linkedlist5 list1=new linkedlist5();
		n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			list=insertAtEnd(list,s.nextInt());
		}
		int m=s.nextInt();
		for(int j=0;j<m;j++)
		{
			list1=insertAtEnd(list1,s.nextInt());
		}
		list=combine(list,list1);
		printlist(list);
	}

}
