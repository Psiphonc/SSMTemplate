package top.psiphonc.service;

import top.psiphonc.pojo.Book;

import java.util.List;

public interface BookService {
    int addBook(Book book);

    int deleteBook(Integer bookId);

    int updateBook(Book book);

    Book queryBookById(Integer bookId);

    List<Book> queryBooks();

    List<Book> queryBookByName(String bookName);
}
