package top.psiphonc.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import top.psiphonc.pojo.Book;
import top.psiphonc.service.BookService;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("bookService")
    BookService bookService;

    @RequestMapping("/allBooks")
    public String list(Model model) {
        final List<Book> books = bookService.queryBooks();
        model.addAttribute("books", books);
        return "allBook";
    }

    @RequestMapping("/toAddBook")
    public String toAddBook() {
        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addBook(Book book){
        System.out.println(book);
        bookService.addBook(book);
        return "redirect:/book/allBooks";
    }

    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(@RequestParam("bookId") int bookId, Model model) {
        final Book book = bookService.queryBookById(bookId);
        model.addAttribute("book", book);
        return "updateBook";
    }
    @RequestMapping("/updateBook")
    public String updateBook(Book book) {
        bookService.updateBook(book);
        return "redirect:/book/allBooks";
    }

    @RequestMapping("/deleteBook")
    public String deleteBook(@RequestParam("bookId") int bookId){
        bookService.deleteBook(bookId);
        return "redirect:/book/allBooks";
    }

    @RequestMapping("/queryBook")
    public String queryBook(String bookName, Model model) {
        final List<Book> books = bookService.queryBookByName(bookName);
        model.addAttribute("books",books);
        return "allBook";
    }
}
