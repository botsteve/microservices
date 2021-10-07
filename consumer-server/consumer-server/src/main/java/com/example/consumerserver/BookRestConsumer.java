package com.example.consumerserver;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="book-service")
public interface BookRestConsumer {

    @GetMapping("/book/data")
    String getBookData();

    @GetMapping("/book/{id}")
    Book getBookById(@PathVariable Integer id);

    @GetMapping("/book/all")
    List<Book> getAllBooks();

    @GetMapping("/book/entity")
    ResponseEntity<String> getEntityData();
}
