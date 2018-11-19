package _01.singleLinkedList;

public class TestSingleLinkedList {
	public static void main(String[] args) {
	  SingleLinkedList<String>liste=new SingleLinkedList<>();
 
	  liste.addFirst("1");
      System.out.println(liste.getSize()); 
      liste.addLast("2");
      System.out.println(liste.getSize());
      liste.addLast("3");
      System.out.println(liste.getSize());
      System.out.println("---------------------");
      System.out.println("İlk eleman"+liste.first());
      System.out.println("son eleman"+liste.last());
 
      liste.addLast("4");
      liste.addLast("5");
      liste.addLast("6");
      liste.addLast("7");
      liste.addLast("8");
      liste.addLast("9");      
      liste.findMiddleElement();
      
      liste.printElement(); 
     
      liste.findMiddleElement();
      
      liste.addLast("10");
      liste.addLast("12");
      liste.addLast("13");
      
      liste.printElement(); 
      
      
      liste.findMiddleElement();
      
     
      
		
	}

}
