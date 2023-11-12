package pl.dyjecinski.techblog.persistence.inmemory;

import org.springframework.stereotype.Repository;
import pl.dyjecinski.techblog.domain.article.Article;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ArticleInMemoryRepository {

    private static List<Article> articleDatabase = new ArrayList<>();

    static {
        articleDatabase.add(new Article(1, "Article 1", "This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer."));
        articleDatabase.add(new Article(2, "Article 2", "This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer."));
        articleDatabase.add(new Article(3, "Article 3", "This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer."));
        articleDatabase.add(new Article(4, "Article 4", "This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer."));
        articleDatabase.add(new Article(5, "Article 5", "This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer."));
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
