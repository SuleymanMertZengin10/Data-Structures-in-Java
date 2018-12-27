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
  
  //listenin eleman sayısını döndürür
  public int getSize() {return size;}
  
  //liste boşmu dolumu kontrol eder 
  public boolean isEmpty() {return size ==0;}
 
  //listenin ilk elemanını döndürür
  public E first() {
	if(isEmpty()) return null;
	return head.getElement();
  }
  
  //listenin son elemanını döndürür
  public E last() {
	  if(isEmpty()) return null;
	  return tail.getElement();
	  
  }
  
  //eleman ekleme işlemini gerçekleştiri
  public void add(E e) {
	  if(head==null) {
		  addFirst(e);
		  return;
	  }
	  addLast(e);
  }
  
  //listenin basına eleman ekler
  private  void addFirst(E e){
	 head=new Node<>(e, null);//yeni bir node olusturduk bir sonraki gösterdiği null
	  if(size==0)
		  tail=head;
	  size++;
	  
  }
  
  //ortadaki elamanın sağ tarafına ekler 
  private void addMiddle(E e ) {

	  Node<E>prev_node=findMiddleElement();
	  if(prev_node==null) {
		  System.out.println("The given previous node cannot be null");
		  return;
	  }
	  Node<E>newest=new Node<E>(e, null);
	  newest.next=prev_node.next;
	  prev_node.next=newest;
      size++;
  }
  
  //listenin sonuna eleman ekler 
  private void addLast(E e) {
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
  
//listenin ilk elemanını siler 
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
  
 //verilen data yı içeren nodu siler 
  public void removeNode(E e) {
      Node temp=head;
      Node prev=null;
      //burada sileceğimiz Node dan bir önceki nodu tutmamız lazımki  aradaki bağlantıyı koparmayalım 
      
      //eğer sileceğimiz elemanı head gösteriyorsa 
      if(temp!=null && temp.element==e) {
    	 
    	  head=temp.next;
    	  size --;
    	  return;
      }
      
      //aradığımız elemanı bulamadıgımız surece ilerliyoruz
      while (temp!=null && temp.element!=e) {
    	  prev=temp;
    	  temp=temp.next;

      }
      if (temp == null) return; 
      
      prev.next = temp.next; 
      
      size--;
  	  
  }

  //verilen pozisyona(indis)deki elemanı siler 
  public void removeNodeByPosition(int position) {
	  // linked list zaten bossa silinecek eleman yok demek 
      
	  if (head == null) 
          return; 
      Node temp = head; 
      
      //eğer head silinecekse
      if(position==0) {
    	  head = temp.next; 
    	  size--;
          return; 
      }
      
      //listenin bölünmesini engellemek için silinecek elemandan önceki elamnı bulmamız gerekiyor
      for (int i=0; temp!=null && i<position-1; i++) {
    	  temp = temp.next;      
      }
      
      //listeyi dolaştık fakat pozisyon listedeki toplam pozisyondan fazlaysa 
      if (temp == null || temp.next == null) {
    	  System.out.println("Aradığımız pozisyon listede yok");
          return;  
      }
    	  
      
      Node next=temp.next.next;
	  
      temp.next=next;
      size--;
      
      
  }
  
  //listenin ortasındaki elemanı bulur 
  public Node  findMiddleElement() {
	  Node slow=head;
	  Node fast=head;
	  
	  if(head!=null) {
		  while(fast !=null && fast.next!=null) {
			  fast=fast.next.next;
			  slow=slow.next;
			 
		  }
		System.out.println("ortanca eleman :" + slow.getElement());  
		  
	  }
	  
	 return slow;
	  
  }
  
  //listedeki elemanları yazdırır
  public void printElement() {
	  Node iterator=head; 
	  while(iterator !=null) {
		  System.out.print(iterator.getElement()+" ");
		 
		  iterator=iterator.next; 
		  
	  }
	  System.out.println();
	 
  }
  
  
  //aranan eleman listede varsa true yok ise false döner 
  public boolean search(E e) {

      Node current = head;    //Initialize current 
      while (current != null) 
      { 
          if (current.element == e) 
              return true;    //data found 
          current = current.next; 
      } 
      return false;    //data not found 
	    }

  int count(E search_for) 
  { 
      Node current = head; 
      int count = 0; 
      while (current != null) 
      { 
          if (current.element == search_for) 
              count++; 
          current = current.next; 
      } 
      return count; 
  } 
}


