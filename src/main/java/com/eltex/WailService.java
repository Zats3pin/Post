package com.eltex;

public class WailService {





    private Post post = new Post.Builder().build();

    public void like(){
        final var likes = post.getLikes() + 1;
        post = post.builder()
                .setLikes(likes)
                .build();
    }
    public void setContent(final String content){
        post = post.builder()
                .setContent(content)
                .build();
    }
    public void setAuthor(final String author){
        post = post.builder()
                .setAuthor(author)
                .build();
    }

    public void setLat(final double lat){
        post = post.builder()
                .setLat(lat)
                .build();
    }
    public void setLong(final double Long){
        post = post.builder()
                .setLong(Long)
                .build();
    }

    public Post getPost(){
        return post;
    }



}
