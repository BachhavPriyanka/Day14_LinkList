package day14_LinkList;

import java.util.ArrayList;

public class LinkedLists<T> {

	Node<T> head;

	public void addLast(T item) {
		Node<T> newNode = new Node<>(item);
		if (head == null)
			head = newNode;
		else if (head.next == null)
			head.next = newNode;
		else {
			Node<T> temp = head;
			while (temp.next != null)
				temp = temp.next;
			temp.next = newNode;
		}
	}

	private boolean isEmpty() {
		if (head == null)
			return true;
		return false;
	}

	public void addFirst(T item) {
		Node<T> newNode = new Node<>(item);

		if (head == null)
			head = newNode;
		else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("list is empty! ");
			return;
		}

		Node<T> temp = head;
		while (temp.next != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

	public void displayFromEnd() {
		if (isEmpty()) {
			System.out.println("list is empty! ");
			return;
		}

		ArrayList<T> nodes = new ArrayList<>();
		Node<T> temp = head;

		while (temp.next != null) {
			nodes.add(temp.data);
			temp = temp.next;
		}
		nodes.add(temp.data);

		for (int i = nodes.size() - 1; i > 0; i--) {
			System.out.print(nodes.get(i) + " -> ");
		}
		System.out.println(nodes.get(0));
	}

	public void insertAt(int index, T item) {
		int count = 0;
		if (index < 1 || index > count + 1) {
			System.out.println("invalid index" + (count + 1));
			return;
		} else if (index == 1) {
			if (head == null)
				System.out.println("list empty! adding " + item + " at index 1.");
			addFirst(item);
		} else if (index == count + 1)
			addLast(item);
		else {
			Node<T> newNode = new Node<>(item);
			Node<T> temp = head;

			for (int i = 1; i < index - 1; i++)
				temp = temp.next;
			newNode.next = temp.next;
			temp.next = newNode;
			count++;
		}
	}

	public void deleteFirst() {
		if (head == null) {
			System.out.println("list is empty!");
			return;
		} else
			head = head.next;
	}

	public void pop() {
		if (head == null) {
			System.out.println("list is empty!");
			return;
		} else
			head = head.next;
	}

	public void popLast() {
		if (head == null) {
			System.out.println("list is empty!");
			return;
		} else if (head.next == null)
			head = head.next;
		else {
			Node<T> temp = head;

			while (temp.next.next != null)
				temp = temp.next;
			System.out.println("deleted " + temp.next.data);
			temp.next = null;
		}
	}

	public void findNode(T nodeToFind) {
		if (isEmpty()) {
			System.out.println("list is empty! cant add after " + nodeToFind);
		} else {
			Node<T> temp = head;
			int count = 0;
			for (int i = 1; i <= count; i++) {
				if (temp.data == nodeToFind) {
					System.out.println(nodeToFind + " found at index " + i);
					return;
				}
				temp = temp.next;
			}
			System.out.println("we couldnt find " + nodeToFind + " in the list.");
		}
	}

	public void addNodeAfter(T prevNode, T nodeToAdd) {
		if (isEmpty()) {
			System.out.println("list is empty! cant add after " + prevNode);
		} else {
			Node<T> temp = head;

			int count = 0;
			for (int i = 1; i <= count; i++) {
				if (temp.data == prevNode) {
					Node<T> newNode = new Node<>(nodeToAdd);
					newNode.next = temp.next;
					temp.next = newNode;
					System.out.println(
							prevNode + " found at index " + i + ". added " + nodeToAdd + " at index " + (i + 1));
					return;
				}
				temp = temp.next;
			}
			System.out.println("we couldnt find " + prevNode + " in the list. perhaps try a different node");
		}
	}

	public short size() {
		if (isEmpty())
			return 0;
		else if (head.next == null)
			return 1;
		else {
			short size = 1;
			Node<T> temp = head;
			short count = 0;
			for (short i = 0; i <= count; i++) {
				if (temp.next == null)
					return size;
				temp = temp.next;
				size++;
			}
			return size;
		}
	}

	public void deleteNode(T nodeTodelete) {
		if (isEmpty()) {
			System.out.println("list empty! cant delete " + nodeTodelete);
		} else if (head.data == nodeTodelete) {
			System.out.println("deleted " + nodeTodelete + " from index " + 1);
			pop();
		} else {
			Node<T> temp = head;
			Node<T> temp2 = head.next;
			int count = 0;
			for (int i = 2; i <= count; i++) {
				if (temp2.data == nodeTodelete) {
					System.out.println("deleted " + nodeTodelete + " from index " + i);
					temp.next = temp2.next;
					count--;
					return;
				}
				temp = temp.next;
				temp2 = temp2.next;
			}
			System.out.println("we couldnt find " + nodeTodelete + " in the list."); // when looped till the end and
																						// couldn't find the node
		}
	}
}

class Node<T> {

	T data;
	Node<T> next;

	Node(T data) {
		this.data = data;
	}
}
