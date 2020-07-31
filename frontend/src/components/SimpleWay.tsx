import React, { useState, useEffect } from "react";
import { gql, ApolloQueryResult } from "@apollo/client";
import { Book, BookResult } from "../types/Book";
import { BookView } from "./BookView";
import { AuthorView } from "./AuthorView";
import { client } from "../config/client";

export function SimpleWay(props: any) {
  const [books, setBooks] = useState<Book[]>();

  useEffect(() => {
    client
      .query({
        query: gql`
          query Books {
            books {
              id
              name
              author {
                id
                name
              }
            }
          }
        `,
      })
      .then((result: ApolloQueryResult<BookResult>) => {
        console.log(result);
        setBooks(result.data?.books);
      });
  }, []);

  return books ? (
    <>
      {books.map((book) => (
        <div key={book.id}>
          <BookView id={book.id} name={book.name} />
          <AuthorView id={book.author.id} name={book.author.name} />
        </div>
      ))}
    </>
  ) : null;
}
