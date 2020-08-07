export interface Author {
  id: number;
  name: string;
}
export interface Book {
  id: number;
  name: string;
  author: Author;
}

export interface BooksResult {
  books: Book[];
}
export interface BookResult {
  book: Book;
}
