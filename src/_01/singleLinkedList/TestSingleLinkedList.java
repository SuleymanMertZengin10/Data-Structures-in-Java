package _01.singleLinkedList;

public class TestSingleLinkedList {
	public static void main(String[] args) {
	  SingleLinkedList<String>liste=new SingleLinkedList<>();
 
	  liste.add("1");
      System.out.println(liste.getSize()); 
      liste.add("2");
      System.out.println(liste.getSize());
      liste.add("3");
      System.out.println(liste.getSize());
      System.out.println("---------------------");
      System.out.println("İlk eleman"+liste.first());
      System.out.println("son eleman"+liste.last());
 
      liste.add("4");
      liste.add("5");
      liste.add("6");
      liste.add("7");
      liste.add("8");
      liste.add("9");  
      
      liste.findMiddleElement();
      
      liste.printElement(); 
     
      liste.findMiddleElement();
      
      liste.add("10");
      liste.add("12");
      liste.add("13");
      
      liste.printElement(); 
      
      
      liste.findMiddleElement();
      
     // liste.addMiddle("21");
      
      liste.printElement(); 
      
      liste.removeNode("1");
      
      System.out.println("after deleting node");
      
      liste.printElement(); 
      System.out.println(liste.getSize());
      
      //indisler 0 dan başlandığı düşünülür
      liste.removeNodeByPosition(2);
      liste.printElement();
      
      liste.removeNodeByPosition(0);
      liste.printElement();
      System.out.println(liste.getSize());
	}

}
