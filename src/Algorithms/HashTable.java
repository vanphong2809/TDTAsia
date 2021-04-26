package Algorithms;

public class HashTable {
	String hashTable[] = new String[10000];
	int hashTableSize = 10000;

	void insert(String s) {
		int index = s.hashCode();
		System.out.println(index);
		while (hashTable[index] != "")
			index = (index + 1) % hashTableSize;
		hashTable[index] = s;
	}

	void search(String s) {
		int index = s.hashCode();
		while (hashTable[index] != s && hashTable[index] != "")
			index = (index + 1) % hashTableSize;
		if (hashTable[index] == s)
			System.out.println("co ton tai");
		else
			System.out.println("Khong tim thay");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hashTable[] = new String[10000];
		int hashTableSize = 10000;
		HashTable ht=new HashTable();
		ht.insert("abcd");
		for(int i=0;i<10000;i++) {
			System.out.println(hashTable[i]);
		}
	}

}
