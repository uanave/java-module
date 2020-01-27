package academy.everyonecodes.java.week6.set1.exercise3;

import java.util.List;

public class Blog {
    private String title;
    private List<Post> posts;
    private Date dateCreated;

    public Blog(String title, List<Post> posts, Date date) {
        this.title = title;
        this.posts = posts;
        this.dateCreated = date;
    }

    public String getTitle() {
        return title;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public Date getDate() {
        return dateCreated;
    }
}
