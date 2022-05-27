package com.codeblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeblog.model.Post;

public interface CodeblogRepository extends JpaRepository<Post, Long>{

}
