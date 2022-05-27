package com.codeblog.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codeblog.model.Post;
import com.codeblog.repository.CodeblogRepository;
import com.codeblog.service.CodeblogService;

@Service
public class CodeblogServiceImpl implements CodeblogService{
	
	@Autowired
	CodeblogRepository codeblogRepository;
	
	@Override
	 public List<Post> findAll(){
		 return codeblogRepository.findAll();
	 }

	@Override
	public Post findById(Long id) {
		// TODO Auto-generated method stub
		return codeblogRepository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		// TODO Auto-generated method stub
		return codeblogRepository.save(post);
	}
}
