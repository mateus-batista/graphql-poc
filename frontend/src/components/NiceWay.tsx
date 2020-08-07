import { gql, useQuery } from "@apollo/client";
import React, { useState } from "react";
import { BookResult, Book } from "../types/Book";
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

const BOOK = gql`
  query Book($id: Int!) {
    book(id: $id) {
      id
      name
      author {
        id
        name
      }
    }
  }
`;

export interface NiceWayProps {}

export function NiceWay(props: NiceWayProps) {
  const [id, setId] = useState(1);

  const { loading, data } = useQuery<BookResult>(BOOK, {
    fetchPolicy: "network-only",
    variables: {
      id: id,
    },
  });

  console.log("redering...");

  if (data?.book) {
    return (
      <>
        <select
          name="options"
          onChange={(event) => setId(Number(event.currentTarget.value))}
          value={id}
        >
          <option value="1">ID 1</option>
          <option value="2">ID 2</option>
          <option value="3">ID 3</option>
        </select>
        <div key={data.book.id}>
          <BookView id={data.book.id} name={data.book.name} />
          <AuthorView id={data.book.author.id} name={data.book.author.name} />
        </div>
      </>
    );
  } else {
    return loading ? <div>Loading...</div> : null;
  }
}
