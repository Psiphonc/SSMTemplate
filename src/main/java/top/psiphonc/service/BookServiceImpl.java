package top.psiphonc.service;

import lombok.Data;
import top.psiphonc.mapper.BookMapper;
import top.psiphonc.pojo.Book;

import java.util.List;

@Data
public class BookServiceImpl implements BookService{
    private BookMapper bookMapper;

    @Override
    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }

    @Override
    public int deleteBook(Integer bookId) {
        return bookMapper.deleteBook(bookId);
    }

    @Override
    public int updateBook(Book book) {
        return bookMapper.updateBook(book);
    }

    @Override
    public Book queryBookById(Integer bookId) {
        return bookMapper.queryBookById(bookId);
    }

    @Override
    public List<Book> queryBooks() {
        return bookMapper.queryBooks();
    }

    @Override
    public List<Book> queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }
}
