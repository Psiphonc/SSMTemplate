package top.psiphonc.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.psiphonc.pojo.Book;

import java.util.List;

import static org.junit.Assert.*;

public class BookServiceTest {
    @Test
    public void bookServiceTest() {
        final ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        final BookService bookService = context.getBean("bookService", BookService.class);
        final List<Book> books = bookService.queryBooks();
        books.forEach(System.out::println);
    }
}