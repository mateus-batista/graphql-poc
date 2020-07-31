import { gql, useQuery } from "@apollo/client";
import React from "react";
import { BookResult } from "../types/Book";
import { AuthorView } from "./AuthorView";
import { BookView } from "./BookView";

const BOOKS = gql`
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
`;

export function NiceWay(props: any) {
  const { loading, data } = useQuery<BookResult>(BOOKS);

  if (data?.books) {
    return (
      <>
        {data.books.map((book) => (
          <div key={book.id}>
            <BookView id={book.id} name={book.name} />
            <AuthorView id={book.author.id} name={book.author.name} />
          </div>
        ))}
      </>
    );
  } else {
    return loading ? <div>"Loading..."</div> : null;
  }
}
