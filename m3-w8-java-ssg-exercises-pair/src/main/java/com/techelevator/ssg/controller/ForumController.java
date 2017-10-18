package com.techelevator.ssg.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techelevator.ssg.model.forum.ForumDao;
import com.techelevator.ssg.model.forum.ForumPost;

@Controller
public class ForumController {
	
	@Autowired
	ForumDao forumDao;

	@RequestMapping ("/forumPosts") 
	public String showAllPosts(ModelMap modelHolder) {
		List<ForumPost> posts = forumDao.getAllPosts();
		modelHolder.put("allPosts", posts);
		
		return "forumPosts";
	}

	@RequestMapping (path="/spaceForumInput", method=RequestMethod.GET) 
		public String displayForumPosts(){
			return"spaceForumInput";
		}

	@RequestMapping(path="/spaceForumInput", method=RequestMethod.POST)
		public String save(@ModelAttribute ForumPost post){
		post.setDatePosted(LocalDateTime.now());
		forumDao.save(post);
		return "redirect:/forumPosts";
	}
	
}
	

