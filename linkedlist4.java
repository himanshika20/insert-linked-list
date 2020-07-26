import java.util.Scanner;
public class linkedlist4 
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
	static linkedlist4 insertAtEnd(linkedlist4 list , int data)
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
	static void find(linkedlist4 list , int data)
	{
		Node n3=list.head;
		int count=0;
		while(n!=0)
		{
			if(n3.data==data)
			{
				count++;
			}
			n--;
			n3=n3.next;
		}
		if(count!=0)
		{
			System.out.println("node is found");
		}
		else
		{
			System.out.println("not found");
		}
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		linkedlist4 list=new linkedlist4();
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			list=insertAtEnd(list,s.nextInt());
		}
		find(list,s.nextInt());
	}
}
