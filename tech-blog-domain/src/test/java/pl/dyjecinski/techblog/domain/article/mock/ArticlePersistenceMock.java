package pl.dyjecinski.techblog.domain.article.mock;

import pl.dyjecinski.techblog.domain.article.Article;
import pl.dyjecinski.techblog.domain.article.ArticlePersistencePort;

import java.util.ArrayList;
import java.util.List;

public class ArticlePersistenceMock implements ArticlePersistencePort {

    private static final List<Article> articles = new ArrayList<>();

    @Override
    public void add(Article article) {
        articles.add(article);
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Article> getAll() {
        return articles;
    }

    @Override
    public Article getById(int id) {
        return null;
    }

    @Override
    public List<Article> findByTag(String tag) {
        return null;
    }

    @Override
    public List<Article> findByCategory(String category) {
        return null;
    }

}
