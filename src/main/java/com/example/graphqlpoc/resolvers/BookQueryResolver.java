package com.example.graphqlpoc.resolvers;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.graphqlpoc.model.Book;
import com.example.graphqlpoc.repository.Repository;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class BookQueryResolver implements GraphQLQueryResolver {

	public List<Book> books() throws InterruptedException {
		Thread.sleep(5000L);
		return Repository.findAllBooks();
	}

	public Book book(Integer bookId) throws InterruptedException {
		Thread.sleep(5000L);
		return Repository.findOneBook(bookId);
	}
}
