package com.kyria.crud.service;

import java.util.List;

import com.kyria.crud.model.Blog;

public interface BlogService {
  
  List<Blog> getAll();

  Blog getById(Long id);

  Blog save(Blog blog);

  Blog update(Blog blog, Long id);

  void delete(Long id);

}
