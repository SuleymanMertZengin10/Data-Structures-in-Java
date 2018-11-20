package _02.circularLinkedList;

public class TestCircularLinkedList {
 public static void main(String[] args) {
	 CircularLinkedList<Integer>liste=new CircularLinkedList<>();
	 liste.addFirst(1);
	 liste.addLast(2);
     liste.addLast(3);
     liste.addLast(4);
     liste.addLast(5);
     liste.addLast(6);
     liste.addLast(7);
     
     System.out.println(liste.getSize());
     liste.printElement();
     liste.removeFirst();
     liste.printElement();
     liste.removeFirst();
     liste.printElement();
     
     System.out.println(liste.getSize());
     System.out.println(liste.isEmpty());
     
     System.out.println(liste.last());
     liste.addFirst(21);
     liste.printElement();

     
 }
}
