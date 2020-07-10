package com.example.graphqlpoc.resolvers;

import org.springframework.stereotype.Component;

import com.example.graphqlpoc.dto.BookInput;
import com.example.graphqlpoc.model.Book;
import com.example.graphqlpoc.repository.Repository;

import graphql.kickstart.tools.GraphQLMutationResolver;

@Component
public class MutationResolver implements GraphQLMutationResolver {
	public Book createBook(BookInput bookInput) {
		return Repository.createBook(bookInput);
	}
}
