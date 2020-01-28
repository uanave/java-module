package academy.everyonecodes.java.week6.set1.exercise3;

import java.util.List;

public class PublishedPostCounter {
    public int count(Blog blog) {
        int count = 0;
        if (blog.getPosts().size() == 0) {
            return count;
        }
        List<Post> posts = blog.getPosts();
        for (Post post : posts) {
            if (post.isPublished()) {
                count++;
            }
        }
        return count;
    }
}
