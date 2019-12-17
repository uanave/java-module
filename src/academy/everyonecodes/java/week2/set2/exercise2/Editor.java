package academy.everyonecodes.java.week2.set2.exercise2;

import academy.everyonecodes.java.week2.set2.exercise1.Article;
import java.util.List;
import java.util.ArrayList;

public class Editor {
    public static Magazine writeMagazine() {
        List<Article> articles = new ArrayList<>();
        Article firstArticle = new Article("Title 1", "Cupcake ipsum dolor sit. Amet cotton candy gingerbread icing macaroon. Marzipan pie pastry croissant macaroon jelly-o. Oat cake jelly-o tart.");
        Article secondArticle = new Article("Title 2", "Liquorice sesame snaps tootsie roll jujubes halvah pastry danish biscuit chupa chups. Cake oat cake sweet. Dessert sugar plum wafer biscuit pie oat cake pastry sesame snaps dragée.");
        Article thirdArticle = new Article("Title 3", "Cheesecake ice cream icing apple pie. Jelly beans ice cream jelly dragée. Cookie cake lollipop sugar plum wafer. Topping caramels brownie danish cotton candy cotton candy chocolate.");
        articles.add(firstArticle);
        articles.add(secondArticle);
        articles.add(thirdArticle);
        Magazine magazine = new Magazine("Viva", articles);

        return magazine;
    }
}
