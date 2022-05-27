package com.codeblog.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.codeblog.model.Post;
import com.codeblog.repository.CodeblogRepository;

public class DummyData {

	@Autowired
	CodeblogRepository codeblogRepository;
	
	//@PostConstruct
	public void savePosts() {
		
		List<Post> postList = new ArrayList<>();
		Post post1 = new Post();
		post1.setAutor("Claudio Holanda");
		post1.setData(LocalDate.now());
		post1.setTitulo("Docker");
		post1.setTexto("Um texto aleatorio criado para este projeto");

		Post post2 = new Post();
		post2.setAutor("Josef climber");
		post2.setData(LocalDate.now());
		post2.setTitulo("Api REST");
		post2.setTexto("Um texto aleatorio novamente criado para este projeto");
		
		postList.add(post1);
		postList.add(post2);
		
		for(Post post: postList) {
			Post postSaved = codeblogRepository.save(post);
			System.out.println(postSaved.getId());
		}

	}

}
