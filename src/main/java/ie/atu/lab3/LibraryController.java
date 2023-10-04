package ie.atu.lab3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryController {

    private LibraryService libraryService;

    @Autowired
    public LibraryController(LibraryService libraryService){
        this.libraryService = libraryService;
    }

    @PostMapping("/addbook")
    public String addBook(@RequestBody Book book){
        libraryService.addBook(book);
        return "Added Book";
    }
    @GetMapping("/getbooks")
    public @ResponseBody List<Book> getBooks(){
        return libraryService.getBooks();
    }
}
