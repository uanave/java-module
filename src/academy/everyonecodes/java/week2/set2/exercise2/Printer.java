package academy.everyonecodes.java.week2.set2.exercise2;

import academy.everyonecodes.java.week2.set2.exercise1.Article;


public class Printer {
    public static void print(Magazine magazine) {
        System.out.println(magazine.getTitle());
        for (Article article : magazine.getArticles()) {
            academy.everyonecodes.java.week2.set2.exercise1.Printer.print(article);
        }

    }

}
