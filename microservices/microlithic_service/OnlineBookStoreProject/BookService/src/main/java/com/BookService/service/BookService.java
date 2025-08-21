package com.BookService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.BookService.dto.BookDTO;
import com.BookService.model.Books;
// import com.BookService.model.Books;
import com.BookService.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository repo;

    private BookDTO convertToDTO(Books book) {
        BookDTO dto = new BookDTO();
        dto.setId(book.getId());
        dto.setAuthor(book.getAuthor());
        dto.setTitle(book.getTitle());
        dto.setPrice(book.getPrice());
        dto.setStock(book.getStock());
        return dto;
    }

    private Books convertToEntity(BookDTO dto) {
        Books book = new Books();
        book.setId(dto.getId());
        book.setTitle(dto.getTitle());
        book.setAuthor(dto.getAuthor());
        book.setPrice(dto.getPrice());
        book.setStock(dto.getStock());
        return book;
    }

    public ResponseEntity<List<BookDTO>> getAllBooks() {
        List<BookDTO> books = repo.findAll().stream().map(this::convertToDTO).toList();
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    public ResponseEntity<BookDTO> getBooksById(int id) {
        BookDTO book = repo.findById(id).map(this::convertToDTO).orElse(null);
        if (book != null) {
            return new ResponseEntity<>(book, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        // return repo.findById(id).map(book -> new ResponseEntity<>(convertToDTO(book),HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND))
    }

    public ResponseEntity<Double> getBookPriceById(int id) {
        Books book = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found with id " + id));
        return new ResponseEntity<>(book.getPrice(), HttpStatus.OK);
    }

    public boolean reduceStock(int id, int quantity) {
        Books book = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found with id " + id));

        if (book.getStock() < quantity) {
            return false; // not enough stock
        }

        book.setStock(book.getStock() - quantity);
        repo.save(book);
        return true;
    }

    public ResponseEntity<BookDTO> addNewBook(BookDTO book) {
        Books saveBook = repo.save(convertToEntity(book));
        return new ResponseEntity<>(convertToDTO(saveBook), HttpStatus.OK);
    }

    public ResponseEntity<List<BookDTO>> addBookInBulk(List<BookDTO> books) {
        List<Books> listOfBook = books.stream().map(this::convertToEntity).toList();
        List<Books> saveAllBook = repo.saveAll(listOfBook);
        List<BookDTO> response = saveAllBook.stream().map(this::convertToDTO).toList();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public ResponseEntity<BookDTO> updateBookDetail(BookDTO dto, int id) {
        return repo.findById(id)
                .map(book -> {
                    book.setTitle(dto.getTitle());
                    book.setAuthor(dto.getAuthor());
                    book.setPrice(dto.getPrice());
                    book.setStock(dto.getStock());
                    Books updated = repo.save(book);
                    return new ResponseEntity<>(convertToDTO(updated), HttpStatus.OK);
                })
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    public ResponseEntity<String> deleteBookById(int id) {
        return repo.findById(id)
                .map(book -> {
                    repo.delete(book);
                    return new ResponseEntity<>(
                            "Book " + book.getTitle() + " by " + book.getAuthor() + " deleted successfully!",
                            HttpStatus.OK
                    );
                })
                .orElse(new ResponseEntity<>("Book Not Found!", HttpStatus.NOT_FOUND));
    }

}
