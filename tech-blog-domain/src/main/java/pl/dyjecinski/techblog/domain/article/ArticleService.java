package pl.dyjecinski.techblog.domain.article;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ArticleService {

    private ArticlePersistencePort articlePersistencePort;

    public void add(Article article) {
        articlePersistencePort.add(article);
    }

    public void delete(int id) {
        articlePersistencePort.delete(id);
    }

    public List<Article> getAll() {
        return articlePersistencePort.getAll();
    }

    public Article getById(int id) {
        return articlePersistencePort.getById(id);
    }

    public List<Article> findByTag(String tag) {
        return new ArrayList<>();
    }

    public List<Article> findByCategory(String category) {
        return new ArrayList<>();
    }

}
