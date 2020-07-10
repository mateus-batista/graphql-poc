package com.example.graphqlpoc.model;

public class Book {
	private int id;
	private String name;
	private int authorId;

	public Book(int id, String name, int authorId) {
		this.id = id;
		this.name = name;
		this.authorId = authorId;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAuthorId() {
		return this.authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
}
