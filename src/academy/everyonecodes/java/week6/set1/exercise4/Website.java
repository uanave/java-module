package academy.everyonecodes.java.week6.set1.exercise4;

import academy.everyonecodes.java.week6.set1.exercise3.Blog;

import java.util.Optional;

public class Website {
    private String url;
    private String content;
    private Optional<Blog> blog;


    public Website(String url, String content, Optional<Blog> blog) {
        this.url = url;
        this.content = content;
        this.blog = blog;
    }

    public String getUrl() {
        return url;
    }

    public String getContent() {
        return content;
    }

    public Optional<Blog> getBlog() {
        return blog;
    }
}
