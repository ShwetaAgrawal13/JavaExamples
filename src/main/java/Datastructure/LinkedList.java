package Datastructure;

public class LinkedList {
Node head;
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args)
    {
        Node first;
LinkedList list= new LinkedList();
list.head=new Node(1);
Node second=new Node(2);
  list.head.next=second;
  Node third=new Node(3);
  second.next=third;
  System.out.print(list.head);
  Node n=list.head;
  while(n!=null)
  {
      System.out.println(n.data);
      n=n.next;
  }


    }
}
