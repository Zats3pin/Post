package com.eltex;
import java.util.Date;
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

    public void setType(final String type){
        post = post.builder()
                .setType(type)
                .build();
    }
    public void setUrl(final String url){
        post = post.builder()
                .setUrl(url)
                .build();
    }

    public void setId(final int id){
        post = post.builder()
                .setId(id)
                .build();
    }

    public void setAuthorId(final int authorId){
        post = post.builder()
                .setAuthorId(authorId)
                .build();
    }

    public void setMentionedMe(final boolean mentionedMe){
        post = post.builder()
                .setMentionedMe(mentionedMe)
                .build();
    }

    public void setLikesByMe(final boolean likesByMe){
        post = post.builder()
                .setLikesByMe(likesByMe)
                .build();
    }

    public void setAuthorJob(final String authorJob){
        post = post.builder()
                .setAuthorJob(authorJob)
                .build();
    }

    public void setAuthorAvatar(final String authorAvatar){
        post = post.builder()
                .setAuthorAvatar(authorAvatar)
                .build();
    }

    public void setPublished(final String published){
        post = post.builder()
                .setPublished(published)
                .build();
    }

    public void setLink(final String link){
        post = post.builder()
                .setLink(link)
                .build();
    }



    public Post getPost(){
        return post;
    }

    public int getId(){
        return post.getId();
    }




}
