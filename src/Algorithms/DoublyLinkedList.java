package Algorithms;
 class NodeD{
	NodeD prev;
	NodeD next;
	int data;
	
	public NodeD(int data) {
		super();
		this.data = data;
	}
	
}
public class DoublyLinkedList {
	NodeD head;
	NodeD tail;
	public NodeD createNode(int value) {
		NodeD newNode=new NodeD(value);
		newNode.next=null;
		newNode.prev=null;
		return newNode;
	}
	public void addHead(int value) {
		NodeD newNode=createNode(value);
		if(head==null && tail==null) {
			head=newNode;
			tail=newNode;
			return;
		}
		head.prev=newNode;
		newNode.next=head;
		head=newNode;
	}
	public void addTail(int value) {
		NodeD newNode=createNode(value);
		if(head==null) {
			head=newNode;
			tail=newNode;
			return;
		}
		tail.next=newNode;
		newNode.prev=tail;
		tail=newNode;
	}
	public void deleteHead() {
		if(head==null) {
			return;
		}
		head=head.next;
		head.prev=null;
	}
	public void deleteTail() {
		if(head==null) {
			return;
		}
		tail=tail.prev;
		tail.next=null;
	}
	public void deleteAt(int position) {
		int k=1;
		NodeD p=head;
		if(position==0||head==null||head.next==null) {
			deleteHead();
		}else{
			while(k!=position && p.next.next!=null) {
				p=p.next;
				++k;
			}
			if(k==position) {
				p.next=p.next.next;
				p.next.prev=p;
			}
		}
	}
	public void print() {
		NodeD temp=tail;
		if(temp==null) {
			System.out.println("Danh sach lien ket khong ton tai");
		}
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.prev;
		}
		System.out.println();
	}
	public boolean search(int value) {
		int position=0;
		for(NodeD p=head;p!=null;p=p.next) {
			if(p.data==value) {
				return true;
			}
			++position;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList dll=new DoublyLinkedList();
		dll.addHead(2);
		dll.addHead(1);
		dll.addHead(6);
		dll.addHead(8);
		System.out.println("Linked list sau khi them 1 phan tu vao dau:");
		dll.print();
		System.out.println("Linked list sau khi them 1 ptu vao cuoi:");
		dll.addTail(5);
		dll.print();
		System.out.println("Linked List sau khi xoa phan tu dau tien");
		dll.deleteHead();
		dll.print();
		System.out.println("Linked List sau khi xoa phan tu cuoi cung");
		dll.deleteTail();
		dll.print();
		System.out.println("Linked List sau khi xoa 1 ptu bat ki:");
		dll.deleteAt(1);
		dll.print();
		System.out.println("Ket qua tim kiem: "+dll.search(6));
	
		
	}

}
