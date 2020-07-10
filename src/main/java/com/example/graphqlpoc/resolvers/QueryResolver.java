package com.example.graphqlpoc.resolvers;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.graphqlpoc.model.Book;
import com.example.graphqlpoc.repository.Repository;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component
public class QueryResolver implements GraphQLQueryResolver {

	public List<Book> books() {
		return Repository.findAllBooks();
	}

	public Book book(Integer bookId) {
		return Repository.findOneBook(bookId);
	}
}
