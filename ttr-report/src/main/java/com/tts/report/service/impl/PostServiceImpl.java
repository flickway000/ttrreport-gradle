package com.tts.report.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.tts.report.beans.Post;
import com.tts.report.repository.PostRepository;

@Servicepublic class PostServiceImpl implements PostService{
@Autowired
private PostRepository postRepository;
@Override
public Post save(Post post) {
        postRepository.save(post);        

              return post;
       }

    @Overridepublic Post findOne(String id) {
        return postRepository.findOne(id);
   }

    @Overridepublic Iterable<Post> findAll() {
        return postRepository.findAll();
   }

    @Overridepublic Page<Post> findByTagsName(String tagName, PageRequest pageRequest) {
        return postRepository.findByTagsName(tagName, pageRequest);
   }
}