package academy.everyonecodes.java.evaluation1.exercise1;

public class AuthorEmailRetriever {
    public String retrieve(Comment comment) {
        String email = comment.getAuthor().getEmail();
        return email;
    }
}
