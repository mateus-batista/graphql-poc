package com.example.graphqlpoc.resolvers;

import org.springframework.stereotype.Component;

import com.example.graphqlpoc.model.Author;
import com.example.graphqlpoc.model.Book;
import com.example.graphqlpoc.repository.Repository;

import graphql.kickstart.tools.GraphQLResolver;

@Component
public class BookResolver implements GraphQLResolver<Book> {

	public Author author(Book book) {
		return Repository.findAuthor(book.getAuthorId());
	}
}
