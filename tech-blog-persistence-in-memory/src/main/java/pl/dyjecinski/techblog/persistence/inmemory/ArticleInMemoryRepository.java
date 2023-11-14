package pl.dyjecinski.techblog.persistence.inmemory;

import org.springframework.stereotype.Repository;
import pl.dyjecinski.techblog.domain.article.Article;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ArticleInMemoryRepository {

    private static final List<Article> articleDatabase = new ArrayList<>();

    static {
        articleDatabase.add(new Article(1, "Co nowego w Java 15?", "Java 15 swoją premierę miała 15 września 2020r. i wprowadziła szereg usprawnień do języka oraz całej platformy."));
        articleDatabase.add(new Article(2, "Co nowego w Java 14?", "Java 14 została oficjalnie udostępniona 17 marca 2020 roku i przynosi szereg usprawnień do języka.      Niektóre ze zmian oznaczone są jako Preview Feature."));
        articleDatabase.add(new Article(3, "Co nowego w Java 13?", "Premiera Javy 13 zaplanowana jest na 17 września 2019 roku. Oprócz drobnych usprawnień planowane jest wprowadzenie 5 nowych funkcjonalności"));
        articleDatabase.add(new Article(4, "Co nowego w Java 12?", "Kolejna wersja Javy: Java 12, oficjalnie pod nazwą JDK 12 osiągnęła poziom w którym zamknięto zakres wprowadzanych funkcjonalności."));
        articleDatabase.add(new Article(5, "Co nowego w Java 11?", "Wraz z nowym cyklem wydawniczym Javy minęły zaledwie 3 miesiące od wydania Javy 10, a już doczekaliśmy się Javy 11."));
    }

    public void add(Article article) {
        articleDatabase.add(article);
    }

    public void delete(int id) {
        articleDatabase.remove(id);
    }

    public List<Article> getAll() {
        return articleDatabase;
    }

    public Article getById(int id) {
        return articleDatabase.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }

}
