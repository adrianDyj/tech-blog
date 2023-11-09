package pl.dyjecinski.techblog.domain.article;

import org.junit.jupiter.api.Test;
import pl.dyjecinski.techblog.domain.article.mock.ArticlePersistenceMock;

public class ArticleServiceTest {

    private ArticleService articleService = new ArticleService(new ArticlePersistenceMock());

    @Test
    void test() {
        Article article = new Article(1, "Test1", "Test2");
        articleService.add(article);

        for (Article article1 : articleService.getAll()) {
            System.out.println(article1.toString());
        }
    }

}
