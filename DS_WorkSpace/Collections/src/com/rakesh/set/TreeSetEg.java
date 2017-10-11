package com.rakesh.set;

import java.util.TreeSet;

public class TreeSetEg {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Vijay");
		ts.add("Ajay");
		ts.add("Sujay");
		ts.add("Bijay");
		ts.add("Pijay");

		System.out.println(ts + "");

		TreeSet<Book> tsb = new TreeSet<Book>();

		Book b1 = new Book("Fate", "Rakesh", 10, 23);
		Book b2 = new Book("Fire", "Tom", 13, 24);
		Book b3 = new Book("Water", "Ted", 15, 25);
		Book b4 = new Book("Wind", "Atom", 18, 26);

		tsb.add(b1);
		tsb.add(b2);
		tsb.add(b3);
		tsb.add(b4);

		for (Book bb : tsb) {
			System.out.println(bb.author + " " + bb.id + " " + bb.quantity + " " + bb.name);
		}
	}

}
