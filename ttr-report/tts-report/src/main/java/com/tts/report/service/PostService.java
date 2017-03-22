package com.tts.report.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.tts.report.beans.Post;

public interface PostService {
	 Post save(Post post);
	    Post findOne(String id);
	    Iterable<Post> findAll();
	    Page<Post> findByTagsName(String tagName, PageRequest pageRequest);
}
