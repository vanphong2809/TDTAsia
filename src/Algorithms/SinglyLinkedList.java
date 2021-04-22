package Algorithms;

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
	}
}

public class SinglyLinkedList {
	Node head;

	// Tao moi mot Node
	public Node createNode(int value) {
		Node temp = new Node(value);
		temp.next = null;
		return temp;
	}

	// Them vao dau linked list
	public Node addHead(Node head, int value) {
		Node temp = createNode(value);
		if (head == null) {
			head = temp;
		} else {
			temp.next = head;
			head = temp;
		}
		return head;
	}

	// Them vao cuoi linked list
	public Node addTail(Node head, int value) {
		Node temp = createNode(value);
		Node p;
		if (head == null) {
			head = temp;
		} else {
			p = head;
			while (p.next != null) {
				p = p.next;
			}
			p.next = temp;
		}
		return head;
	}

	// Them vao vi tri bat ki trong linked list
	public Node addAt(Node head, int position, int value) {
		SinglyLinkedList sll = new SinglyLinkedList();
		Node temp = createNode(value);
		if (value == 0) {
			sll.addHead(head, value);
		} else {
			int k = 1;
			Node p = head;
			while (k != position && p.next != null) {
				p = p.next;
				++k;
			}
			if (k == position) {
				temp.next = p.next;
				p.next = temp;
			} else {
				System.out.println("Vi tri them khong hop le");
			}
		}
		return head;
	}
	// Xoa phan tu dau trong Linked List
	public Node DeleteHead(Node head) {
		if(head==null) {
			System.out.println("Linked List trong, khong co gi de xoa");
		}else {
			head=head.next;
		}
		return head;
	}//Xoa phan tu cuoi linked list
	public Node DeleteTail(Node head) {
		if(head==null||head.next==null) {
			return DeleteHead(head);
		}else {
			Node p=head;
			while(p.next.next!=null) {
				p=p.next;
			}
			p.next=p.next.next;
		}
		return head;
	}
	public Node deleteAt(Node head, int position) {
		int k=1;
		Node p=head;
		if(position==0||head==null||head.next==null) {
			return DeleteHead(head);
		}else {
			while(k!=position && p.next.next!=null) {
				p=p.next;
				++k;
			}
			if(k==position) {
				p.next=p.next.next;
			}else {
				System.out.println("Vi tri xoa khong hop le");
			}
			
		}
		return head;
	}
	public int Search(Node head, int value) {
		int position=0;
		Node p=head;
		while(p.data!=value && p.next!=null) {
			p=p.next;
			++position;
		}
		if(p.data==value) {
			return position;
		}
		return -1;
	}
	void Print(Node head) {
		for (Node p = head; p != null; p = p.next) {
			System.out.print(p.data+"  ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		Node head = sll.createNode(3);
		System.out.println("Linked List sau khi khoi tao");
		sll.Print(head);
		head = sll.addHead(head, 5);
		System.out.println("Linked List sau khi them phan tu vao vi tri dau tien");
		sll.Print(head);
		sll.addTail(head, 9);
		System.out.println("Linked List sau khi them tu vao vi tri cuoi cung");
		sll.Print(head);
		head = sll.addAt(head, 2, 7);
		System.out.println("Linked List sau khi chen 1 phan tu vao vi tri bat ki");
		sll.Print(head);
		
		int value=10;
		System.out.println("Ket qua tim kiem so "+value+": "+sll.Search(head, value));
		
		
		head=sll.DeleteHead(head);
		System.out.println("Linked List sau khi xoa phan tu dau tien");
		sll.Print(head);
		head=sll.deleteAt(head, 2);
		System.out.println("Linked List sau khi xoa 1 phan tu o vi tri bat ki");
		sll.Print(head);
		
	}
}
