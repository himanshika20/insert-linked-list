import java.util.Scanner;
public class linkedlist2 
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
	static linkedlist2 insertAtBegin(linkedlist2 list , int data)
	{
		Node n3=new Node(data);
		if(list.head==null)
		{
			list.head=n3;
		}
		else
		{
			n3.next=list.head;
			list.head=n3;
		}
		return list;
	}
	static void printlist(linkedlist2 list)
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
		linkedlist2 list=new linkedlist2();
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			list=insertAtBegin(list,s.nextInt());
		}
		printlist(list);
	}
}
