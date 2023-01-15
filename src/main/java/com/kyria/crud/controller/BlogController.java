package com.kyria.crud.controller;

import com.kyria.crud.model.Blog;
import com.kyria.crud.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blogs")
@CrossOrigin("http://localhost:3000")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping
    public List<Blog> getAll(){
        return blogService.getAll();
    }

    @GetMapping("/{id}")
    public Blog getById(@PathVariable ("id") Long id){
        return blogService.getById(id);
    }

    @PostMapping
    public Blog save(@RequestBody Blog blog){
        return blogService.save(blog);
    }

    @PutMapping("/{id}")
    public Blog update(@RequestBody Blog blog, @PathVariable ("id") Long id){
        return blogService.update(blog, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id") Long id){
        blogService.delete(id);
    }



}
