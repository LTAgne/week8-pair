package com.techelevator.ssg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import com.techelevator.ssg.model.forum.ForumDao;
import com.techelevator.ssg.model.forum.ForumPost;

@Controller
public class ForumController {
	
	@Autowired
	ForumDao forumDao;

	public String showAllPosts(ModelMap modelHolder) {
		List<ForumPost> posts = forumDao.getAllPosts();
		modelHolder.put("allPosts", posts);
		
		return "forumPosts";
	}

}
