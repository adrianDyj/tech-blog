package pl.dyjecinski.techblog.persistence.article;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.dyjecinski.techblog.domain.article.Article;
import pl.dyjecinski.techblog.domain.article.ArticlePersistencePort;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ArticlePersistenceAdapter implements ArticlePersistencePort {

    private ArticleLoader articleLoader;

    @Override
    public List<Article> getAll() {
        ArticleWrapper articleWrapper = articleLoader.loadArticles();
        List<Article> result = new ArrayList<>();
        for (ArticleEntity entity : articleWrapper.getArticles()) {
            result.add(new Article(entity.getId(), entity.getTitle(), entity.getDescription()));
        }
        return result;
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
