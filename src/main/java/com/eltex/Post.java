package com.eltex;


import java.util.Date;
import java.util.Random;
//import org.jetbrains.annotations.Nullable;

public class Post {


    int likes;
    int id;
    int authorId;
    String author;
    String authorJob;
    String authorAvatar;
    String content;
    String published;
    String link;
    boolean mentionedMe;

    boolean likesByMe;

    Coordinates coords = new Coordinates();
    Attachment attach  = new Attachment();






    public Post(String content, String author, int likes){
        this.content = content;
        this.author = author;
        this.likes = likes;
    }





    public Post(int id, int authorId, boolean mentionedMe, boolean likesByMe, String authorJob, String authorAvatar, String published, String link, String content, String author, int likes, double lat, double Long, String type, String url){
        this.id = id;
        this.authorId = authorId;
        this.mentionedMe = mentionedMe;
        this.likesByMe = likesByMe;
        this.authorJob = authorJob;
        this.authorAvatar = authorAvatar;
        this.content = content;
        this.author = author;
        this.likes = likes;
        this.coords.lat = lat;
        this.coords.Long = Long;
        this.attach.type = type;
        this.attach.url = url;
        this.link = link;
        this.published = published;
    }

////////////////////////////////////////GETTER SETTER//////////////////////////////

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getLikes() {
        return likes;
    }

    public int getId() {
        return id;
    }

    public int getAuthorId() {
        return authorId;
    }

    public String getAuthor() {
        return author;
    }

    public String getAuthorJob() {
        return authorJob;
    }

    public String getAuthorAvatar() {
        return authorAvatar;
    }

    public String getContent() {
        return content;
    }

    public String getPublished() {
        return published;
    }

    public String getLink() {
        return link;
    }

    public boolean isMentionedMe() {
        return mentionedMe;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAuthorJob(String autorJob) {
        this.authorJob = autorJob;
    }

    public void setAuthorAvatar(String autorAvatar) {
        this.authorAvatar = autorAvatar;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public void setLink(String link) {
        link = link;
    }

    public void setMentionedMe(boolean mentionedMe) {
        this.mentionedMe = mentionedMe;
    }

    public Coordinates getCoords() {
        return coords;
    }

    public void setCoords(Coordinates coords) {
        this.coords = coords;
    }




    public boolean isLikesByMe() {
        return likesByMe;
    }

    public void setLikesByMe(boolean likesByMe) {
        this.likesByMe = likesByMe;
    }

    @Override
    public String toString()
    {
        return  this.author + " - Автор \n " +
                this.authorAvatar + " - Ссылка на аватар \n " +
                this.authorId + " - id автора \n " +
                this.authorId + " - Работа автора \n " +
                this.link + " - Ссылка на статью \n " +
                this.content + " - Статья \n " +
                this.attach.type+ " - Тип вложения \n " +
                this.attach.url + " - Ссылка на вложение \n "+
                this.likes + " - Кол-во лайков \n " +
                this.likesByMe +   " - Мой лайк \n " +
                this.mentionedMe +   " - мой пост \n " +
                this.id + " - id \n " +
                this.published  + " - время публикации \n "+
                this.coords.lat+ " - Координаты(широта) \n " +
                this.coords.Long+ " - Координаты(долгота) \n ";


    }







    public Builder builder(){
        return new Builder()

                .setAuthor(author)
                .setContent(content)
                .setLikes(likes)
                .setLat(coords.lat)
                .setLong(coords.Long)
                .setType(attach.type)
                .setUrl(attach.url)
                .setId(id)
                .setAuthorId(authorId)
                .setMentionedMe(mentionedMe)
                .setLikesByMe(likesByMe)
                .setAuthorJob(authorJob)
                .setAuthorAvatar(authorAvatar)
                .setPublished(published)
                .setLink(link);
    }
























    static class Builder {
        Date date = new Date();

        // Обязательно указываем начальные значения полей
        private String content = "";
        private String author = "";
        private int likes = 0;
        private int id = 1 + (int)(Math.random() * ((10000 - 1) + 1));
        private int authorId = 0;
        private String authorJob = "";
        private String authorAvatar = "";
        private String published = String.valueOf(date);
        private String link = "https://" + id + ".com";
        private boolean mentionedMe = true;
        private  boolean likesByMe = false;



        Coordinates coords = new Coordinates();
        Attachment attach = new Attachment();



        // Каждый метод строителя запоминает данные и возвращает сам себя
        public Builder setContent( String content) {
            this.content = content;
            return this;
        }

        public Builder setAuthor( String author) {
            this.author = author;
            return this;
        }

        public Builder setLikes( int likes) {
            this.likes = likes;
            return this;
        }

        public Builder setLat( double lat) {
            this.coords.lat = lat;
            return this;
        }

        public Builder setLong( double Long) {
            this.coords.Long = Long;
            return this;
        }

        public Builder setType( String type) {
            this.attach.type = type;
            return this;
        }

        public Builder setUrl( String url) {
            this.attach.url = url;
            return this;
        }

        public Builder setId( int id) {
            this.id = id;
            return this;
        }

        public Builder setAuthorId( int authorId) {
            this.authorId = authorId;
            return this;
        }

        public Builder setMentionedMe( boolean mentionedMe) {
            this.mentionedMe = mentionedMe;
            return this;
        }
        public Builder setLikesByMe( boolean likesByMe) {
            this.likesByMe = likesByMe;
            return this;
        }

        public Builder setAuthorJob( String authorJob) {
            this.authorJob = authorJob;
            return this;
        }

        public Builder setAuthorAvatar( String authorAvatar) {
            this.authorAvatar = authorAvatar;
            return this;
        }

        public Builder setPublished( String published) {
            this.published = published;
            return this;
        }

        public Builder setLink( String Link) {
            this.link = link;
            return this;
        }





        // В финале вызываем build, чтобы получить результат
        public Post build() {
            return new Post(id, authorId, mentionedMe, likesByMe, authorJob, authorAvatar, published, link, content, author, likes, coords.lat, coords.Long,attach.type,attach.url);
        }

    }

}
