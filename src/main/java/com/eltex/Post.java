package com.eltex;

//import org.jetbrains.annotations.Nullable;

public class Post {


    int likes;
    int id;
    int authorId;
    String author;
    String autorJob;
    String autorAvatar;
    String content;
    String published;
    String Link;
    boolean mentionedMe;

    Coordinates coords = new Coordinates();
    Attachment attach  = new Attachment();





    boolean likesByMe;
    public Post(String content, String author, int likes){
        this.content = content;
        this.author = author;
        this.likes = likes;
    }

    public Post(String content, String author, int likes, double lat, double Long, String type, String url){
        this.content = content;
        this.author = author;
        this.likes = likes;
        this.coords.lat = lat;
        this.coords.Long = Long;
        this.attach.type = type;
        this.attach.url = url;
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

    public String getAutorJob() {
        return autorJob;
    }

    public String getAutorAvatar() {
        return autorAvatar;
    }

    public String getContent() {
        return content;
    }

    public String getPublished() {
        return published;
    }

    public String getLink() {
        return Link;
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

    public void setAutorJob(String autorJob) {
        this.autorJob = autorJob;
    }

    public void setAutorAvatar(String autorAvatar) {
        this.autorAvatar = autorAvatar;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public void setLink(String link) {
        Link = link;
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
        return this.content + " - Статья \n " + this.author + " - Автор \n " + this.likes+ " - Кол-во лайков \n " + this.coords.lat+ " - Координаты(широта) \n " + this.coords.Long+ " - Координаты(долгота) \n " + this.attach.type+ " - Тип вложения \n " + this.attach.url + " - Ссылка на вложение \n ";
    }







    public Builder builder(){
        return new Builder()
                .setAuthor(author)
                .setContent(content)
                .setLikes(likes)
                .setLat(coords.lat)
                .setLong(coords.Long)
                .setType(attach.type)
                .setUrl(attach.url);

    }

    static class Builder {
        // Обязательно указываем начальные значения полей
        private String content = "";
        private String author = "";
        private int likes = 0;

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




        // В финале вызываем build, чтобы получить результат
        public Post build() {
            return new Post(content, author, likes, coords.lat, coords.Long,attach.type,attach.url);
        }

    }

}
