package com.kyria.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kyria.crud.model.Blog;
import com.kyria.crud.repository.BlogRepository;

@Service
public class BlogServiceImpl implements BlogService{

  @Autowired
  private BlogRepository blogRepository;

  @Override
  public List<Blog> getAll() {
    
    return blogRepository.findAll();
  }

  @Override
  public Blog getById(Long id) {
    
    return blogRepository.findById(id).get();
  }

  @Override
  public Blog save(Blog blog) {

    return blogRepository.save(blog);
  }

  @Override
  public Blog update(Blog blog, Long id) {
    Blog existigBlog = getById(id);
    existigBlog.setContenu(blog.getContenu());
    existigBlog.setTitre(blog.getTitre());
    existigBlog.setAuteur(blog.getAuteur());
    existigBlog.setPreview(blog.getPreview());
    return blogRepository.save(existigBlog);
  }

  @Override
  public void delete(Long id) {
    blogRepository.deleteById(id);
    
  }
  
}
