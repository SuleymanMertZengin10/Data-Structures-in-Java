package _01.singleLinkedList;

public class SingleLinkedList<E> {
	
  private static class Node<E>{
		private E element;
		private Node<E>next;
		public Node(E e,Node<E>n) {
			element =e;
			next=n;
		}
		public E getElement() {return element;}
        public Node<E>getNext(){return next;}
        public void setNext(Node<E>n) {next=n;}
        
		
	 }	

  private Node<E>head=null;  //linked liste nin  basını gösteriyor ilk basta boş
  private Node<E>tail=null;  //linked liste nin  sonunu gösteriyor
  
  private int size=0; // link listenin boyutu başlangıçta 0 
  
  public SingleLinkedList(){}
  public int getSize() {return size;}
  public boolean isEmpty() {return size ==0;}
  
  public E first() {
	if(isEmpty()) return null;
	return head.getElement();
  }
  
  public E last() {
	  if(isEmpty()) return null;
	  return tail.getElement();
	  
  }
  
  public void addFirst(E e){
	 head=new Node<>(e, null);//yeni bir node olusturduk bir sonraki gösterdiği null
	  if(size==0)
		  tail=head;
	  size++;
	  
  }
 
  public void addLast(E e) {
	  Node<E>newest=new Node<E>(e, null);
	  if(isEmpty()) {
		  head=newest;
	  }
	  else {

	  tail.setNext(newest);
	  tail=newest;
	  size++;
	
	  }
  }
  public E removeFirst() {
	  if(isEmpty())return null;
	  E firstElement=head.getElement();
	  head=head.next;
	  size--;
	  if(size==0) {
		  tail=null;

	  }
		  
	  return firstElement;   	  
	  
  }
  
  public void  findMiddleElement() {
	  Node slow=head;
	  Node fast=head;
	  
	  if(head!=null) {
		  while(fast !=null && fast.next!=null) {
			  fast=fast.next.next;
			  slow=slow.next;
			 
		  }
		System.out.println("ortanca eleman :" + slow.getElement());  
		  
	  }
	  
  }
  
  public void printElement() {
	  Node iterator=head; 
	  while(iterator !=null) {
		  System.out.print(iterator.getElement()+" ");
		 
		  iterator=iterator.next; 
		  
	  }
	  System.out.println();
	  
	  
  }
   
}
