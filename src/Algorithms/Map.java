package Algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

class Student {
	int id;
	String ten;
	String khoa;

	public Student(int id, String ten, String khoa) {
		super();
		this.id = id;
		this.ten = ten;
		this.khoa = khoa;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", ten=" + ten + ", khoa=" + khoa + "]";
	}
	
}

public class Map {

	public static void main(String[] args) {
		//Map<Key, Value>
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(100, "A");
		map1.put(101, "B");
		map1.put(102, "C");   
		Set<Integer> set = map1.keySet();
		for (Integer key : set) {
			System.out.println(key + " " + map1.get(key));
		}
		
		
		//Map<key, List<Object>>
		Student stu1 = new Student(1, "Nguyen Van Phong", "CNTT");
		Student stu2 = new Student(2, "Nguyen Van Kha", "CNTT");
		ArrayList<Student> listStudent = new ArrayList<Student>();
		listStudent.add(stu1);
		listStudent.add(stu2);
		HashMap<Integer, ArrayList<Student>> map2 = new HashMap<Integer, ArrayList<Student>>();
		map2.put(1, listStudent);
		System.out.println(map2);
		
		//Map<List<Key>,List<Object>>
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		HashMap<ArrayList<Integer>, ArrayList<Student>> map3=new HashMap<ArrayList<Integer>, ArrayList<Student>>();
		map3.put(list, listStudent);
		System.out.println(map3);
	}

}
