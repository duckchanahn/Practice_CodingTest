package data_structure.linear.linkedList;

import data_structure.linear.linkedList.Node;

public class SimpleLinkedList {
	
	Node head; // => ���� ���!
	int size;
	
	public SimpleLinkedList() {
		// TODO Auto-generated constructor stub
		head = null;
		size = 0;
	}
	
	String get(int index) {
		Node temp = head;
		// for(int i=0; i <= index-1; i++)
		for(int i=0; i < index; i++) {
			temp = temp.next;
		}
		return temp.data;
	}
	
	void add(int index, String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			size++;
		}else if(index == 0) {
			newNode.next = head;
			head = newNode;
			size++;
		}else if(index == size) {
			Node temp = head;
			for(int i=0; i < size-1; i++) {
				temp = temp.next;
			}
			temp.next = newNode;
			size++;
		}
		
		Node temp = head;
		for(int i=0; i < index-1; i++) {
			temp = temp.next;
		}

		newNode.next = temp.next;
		temp.next = newNode;
		size++;
	}
	
	String remove(int index) {
		return null;
	}
	
	boolean remove(String data) {
		return false;
	}
	
	int indexOf(String str) {
		Node temp = head;
		for(int i=0; i<size; i++) {
			if(temp.data == str) {
				return i;
			}
		}
		return -1;
	}
	
	int sizeOf() {
		return size;
	}
	
	@Override
	public String toString() {
		Node temp = head;
		String result = "";
	    for(int i = 0; i < size; i++) {
	    	result = result + temp.data.toString() + "  ";
	    	temp = temp.next;
	    }
	    return result;
	}
	
}
