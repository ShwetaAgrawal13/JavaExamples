package Datastructure;

public class BinarySearch {
    Node head;
    Node tail;
    public static class Node{

        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data=data;
        }
    }
    public static void main(String[] args)
    {
BinarySearch bs = new BinarySearch();
bs.head.data=1;
Node First=new Node(2);
Node second=new Node(3);
bs.head.next=First;
First.next=second;
second.next=bs.tail;
First.prev=bs.head;
second.prev=First;
bs.tail.prev=second;

        Node temp=bs.head;
        while(temp.next!=null) {
            System.out.println(temp.data);
        }

    }
}
