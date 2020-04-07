package in.lokendra.onlinebookstore.repository;

import in.lokendra.onlinebookstore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
