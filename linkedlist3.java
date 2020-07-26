import java.util.Scanner;
public class linkedlist3 
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
	static linkedlist3 insertAtEnd(linkedlist3 list , int data)
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
	static linkedlist3 insertmiddle(linkedlist3 list , int data)
	{
		Node n3=new Node(data);
		Node n4=list.head;
		for(int i=1;i<=n;i++)
		{
			if(i==n/2)
			{
				n3.next=n4.next;
				n4.next=n3; 
			}
			n4=n4.next;
		}
		return list;
	}
	static void printlist(linkedlist3 list)
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
		linkedlist3 list=new linkedlist3();
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			list=insertAtEnd(list,s.nextInt());
		}
		list=insertmiddle(list , s.nextInt());
		printlist(list);	
	}

}
