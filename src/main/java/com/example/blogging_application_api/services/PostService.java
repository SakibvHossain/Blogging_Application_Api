package com.example.blogging_application_api.services;

import com.example.blogging_application_api.entity.Post;
import com.example.blogging_application_api.payload.dtos.PostDTO;

import java.util.List;

public interface PostService {
    //Create
    PostDTO createPost(PostDTO postDTO, Integer userId, Integer categoryId);
    //Update
    PostDTO updatePost(PostDTO postDTO, Integer postId);
    //Delete
    void deletePost(Integer postId);
    //Get
    PostDTO getPostById(Integer postId);
    //Get All
    //Implementing pagination and sorting
    List<PostDTO> getAllPosts(Integer pageNumber, Integer pageSize);
    //Get all post by Category
    List<PostDTO> getPostsByCategory(Integer categoryId);
    //Get all post by User
    List<PostDTO> getPostsByUser(Integer userId);
    //Search posts
    List<PostDTO> searchPosts(String keyword);
}
