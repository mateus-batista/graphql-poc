package com.example.graphqlpoc.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import com.example.graphqlpoc.dto.BookInput;
import com.example.graphqlpoc.model.Author;
import com.example.graphqlpoc.model.Book;

public class Repository {

	private Repository() {

	}

	private static final List<Book> books = new ArrayList<>(Arrays.asList(
			new Book(1, "Lord of the Rings", 1),
			new Book(2, "Prince of Thorns", 2),
			new Book(3, "The left hand of God", 3)));

	private static final AtomicInteger id = new AtomicInteger(3);

	public static Author findAuthor(int id) {
		return new Author(id, "Author " + id);
	}

	public static List<Book> findAllBooks() {
		return books;
	}

	public static Book findOneBook(Integer bookId) {
		return books.stream().filter(book -> book.getId() == bookId).findFirst().orElse(null);
	}

	public static Book createBook(BookInput bookInput) {
		Book newBook = new Book(id.incrementAndGet(), bookInput.getName(), bookInput.getAuthorId());

		books.add(newBook);

		return newBook;
	}
}
