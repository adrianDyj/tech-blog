package pl.dyjecinski.techblog.domain.article;

import java.util.List;

public interface ArticlePersistencePort {

    List<Article> getAll();
    Article getById(int id);
    List<Article> findByTag(String tag);
    List<Article> findByCategory(String category);

}