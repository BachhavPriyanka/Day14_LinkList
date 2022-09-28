package day14_LinkList;

public class List {
	public static void main(String[] args) {

	    LinkedLists<Integer> linkedL = new LinkedLists<>();

	    linkedL.addLast(56);
	    linkedL.addLast(70);
	    linkedL.display();
	    linkedL.insertAt(2, 30);
	    linkedL.display();
	    linkedL.addNodeAfter(30, 40);
	    linkedL.display();
	    System.out.println("size is " + linkedL.size());
	    linkedL.deleteNode(70);
	    System.out.println("size is " + linkedL.size());
	    linkedL.display();

	  }
}
