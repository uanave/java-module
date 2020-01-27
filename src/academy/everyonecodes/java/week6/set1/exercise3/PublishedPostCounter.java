package academy.everyonecodes.java.week6.set1.exercise3;

public class PublishedPostCounter {
    public int count(Blog blog) {
        int count = 0;
        if (blog.getPosts().size() == 0) {
            return count;
        }
        for (Post post : blog.getPosts()) {
            Date postDate = post.getDateCreated();
            Date blogDate = blog.getDate();
            if (postDate.getDay() == blogDate.getDay() && postDate.getMonth() == blogDate.getMonth() && postDate.getYear() == blogDate.getYear()) {
                count++;
            }
        }
        return count;
    }
}
