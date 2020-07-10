package com.example.graphqlpoc.dto;

public class BookInput {
	private String name;
	private int authorId;

	public BookInput(String name, int authorId) {
		this.name = name;
		this.authorId = authorId;
	}

	public BookInput() {
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
