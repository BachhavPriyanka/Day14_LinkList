package day14_LinkList;

public class Lists {
	public static void main(String[] args) {

	    LinkedLists<Integer> linkedL = new LinkedLists<>();

	    linkedL.addLast(56);
	    linkedL.addLast(70);
	    linkedL.display();
	    linkedL.insertAt(2, 30);
	    linkedL.display();
	    linkedL.deleteFirst();
	    linkedL.display();

	  }
}