package top.psiphonc.mapper;

import org.apache.ibatis.annotations.Param;
import top.psiphonc.pojo.Book;

import java.util.List;

public interface BookMapper {
    int addBook(Book book);

    int deleteBook(@Param("bookId") Integer bookId);

    int updateBook(Book book);

    Book queryBookById(@Param("bookId") Integer bookId);

    List<Book> queryBooks();

    List<Book> queryBookByName(@Param("bookName")String bookName);
}
