package com.codeblog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.codeblog.model.Post;
import com.codeblog.service.CodeblogService;

@Controller
public class CodeblogController {
	
	@Autowired
	CodeblogService codeblogService;
	
	@RequestMapping(value = "/posts", method = RequestMethod.GET)
	public ModelAndView getPosts() {
		//String viewName;
		ModelAndView mv = new ModelAndView("posts");
		List<Post> posts = codeblogService.findAll();
		//String attributeName;
		mv.addObject("posts", posts);
		return mv;
		
	}
	@RequestMapping(value = "/posts/{id}", method = RequestMethod.GET)
	public ModelAndView getPostsDetails(@PathVariable("id") long id) {
		//String viewName;
		ModelAndView mv = new ModelAndView("PostDetails");
		Post post = codeblogService.findById(id);
		//String attributeName;
		mv.addObject("post", post);
		return mv;
		
	}

}
