package io.javabrains.springbootstarter.books;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@RequestMapping("/books")
	public List<Book> listBooks() {
		return Arrays.asList(new Book("Joshua Bloch", "Effective Java")
				            ,new Book("Craig Walls", "Spring in Action")
				            );
	}
	
}
