package codes;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class collection {

	public static void main(String[] args) {
		al();
		ll();
		hs();
		lhs();
		ts();
		hm();
		lhm();
		tm();
		sk();
		vc();
		dq();
	}
	public static void al() {
		ArrayList<Integer> hs=new ArrayList<Integer>();
		hs.add(1);
		hs.add(5);
		hs.add(4);
		hs.add(3);
		hs.add(2);
		hs.add(1);
		System.out.println("Array List :"+hs);
	}
	public static void ll() {
		LinkedList<Integer> hs=new LinkedList<Integer>();
		hs.add(1);
		hs.add(5);
		hs.add(4);
		hs.add(3);
		hs.add(2);
		hs.add(1);
		System.out.println("Linked List :"+hs);
	}
	public static void hs() {
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(1);
		hs.add(5);
		hs.add(4);
		hs.add(3);
		hs.add(2);
		hs.add(1);
		System.out.println("Hash Set :"+hs);
	}
	
	public static void lhs() {
		LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>();
		hs.add(1);
		hs.add(5);
		hs.add(3);
		hs.add(4);
		hs.add(2);
		hs.add(1);
		System.out.println("Linked HashSet :"+hs);
	}
	public static void ts() {
		TreeSet<Integer> hs=new TreeSet<Integer>();
		hs.add(1);
		hs.add(5);
		hs.add(3);
		hs.add(4);
		hs.add(2);
		hs.add(1);
		System.out.println("TreeSet :"+hs);
	}
	public static void hm() {
		HashMap<Integer,Integer> hs =new HashMap<Integer,Integer>();
        hs.put(1,10);
        hs.put(5,50);
        hs.put(3,30);
        hs.put(4,40);
        hs.put(2,20);
        hs.put(6,10); // key doesn't allow duplicate.But value allows
		System.out.println("Hash Map :"+hs);

}
	public static void lhm() {
		LinkedHashMap<Integer,Integer> hs =new LinkedHashMap<Integer,Integer>();
        hs.put(1,10);
        hs.put(5,50);
        hs.put(3,30);
        hs.put(4,40);
        hs.put(2,20);
        hs.put(6,10); // key doesn't allow duplicate.But value allows
		System.out.println("Linked HashMap :"+hs);
}
	public static void tm() {
		TreeMap<Integer,Integer> hs =new TreeMap<Integer,Integer>();
        hs.put(1,10);
        hs.put(5,50);
        hs.put(3,30);
        hs.put(4,40);
        hs.put(2,20);
        hs.put(6,10); // key doesn't allow duplicate.But value allows
		System.out.println("TreeMap :"+hs);

}
public static void sk() {
		Stack<Integer> hs =new Stack<Integer>();
        hs.push(1);
        hs.push(5);
        hs.push(4);
        hs.push(3);
        hs.push(2);
        hs.push(1);
		System.out.println("Stack :"+hs);

}
public static void vc() {
	Vector<Integer> hs =new Vector<Integer>();
    hs.add(1);
    hs.add(5);
    hs.add(4);
    hs.add(3);
    hs.add(2);
    hs.add(1);
	System.out.println("Vector :"+hs);
}
public static void dq() {
	ArrayDeque<Integer> hs =new ArrayDeque<Integer>();
    hs.add(1);
    hs.add(5);
    hs.add(4);
    hs.add(3);
    hs.add(2);
    hs.add(1);
	System.out.println("ArrayDeque :"+hs);
}	
}
