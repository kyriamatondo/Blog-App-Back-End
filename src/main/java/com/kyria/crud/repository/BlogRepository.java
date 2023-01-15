package com.kyria.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kyria.crud.model.Blog;

public interface BlogRepository extends JpaRepository<Blog, Long> {
  
}
