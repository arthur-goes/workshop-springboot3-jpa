package com.apg.workshopspringboot3jpa.resources;

import com.apg.workshopspringboot3jpa.entities.Category;
import com.apg.workshopspringboot3jpa.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.Serializable;
import java.util.List;

@Controller
@RequestMapping(value ="/categories")
public class CategoryResource implements Serializable {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> categories = categoryService.findAll();
        return ResponseEntity.ok().body(categories);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@RequestParam Long id) {
        Category category = categoryService.findById(id);
        return ResponseEntity.ok().body(category);
    }
}
