package pl.dyjecinski.techblog.persistence.inmemory;

import lombok.AllArgsConstructor;
import pl.dyjecinski.techblog.domain.article.Article;
import pl.dyjecinski.techblog.domain.article.ArticlePersistencePort;

import java.util.List;

@AllArgsConstructor
public class ArticlePersistenceAdapter implements ArticlePersistencePort {

    private ArticleInMemoryRepository repository;

    @Override
    public void add(Article article) {
        repository.add(article);
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }

    @Override
    public List<Article> getAll() {
        return repository.getAll();
    }

    @Override
    public Article getById(int id) {
        return repository.getById(id);
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
