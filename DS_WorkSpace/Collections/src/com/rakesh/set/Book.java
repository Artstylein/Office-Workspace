package com.rakesh.set;

public class Book implements Comparable<Book> {

	String name;
	String author;
	int quantity, id;

	public Book(String name, String author, int quantity, int id) {
		super();
		this.name = name;
		this.author = author;
		this.quantity = quantity;
		this.id = id;
	}

	@Override
	public int compareTo(Book o) {
		if (id > o.id) {
			return 1;
		} else if (id < o.id) {
			return -1;
		} else {
			return 0;
		}

	}
}
