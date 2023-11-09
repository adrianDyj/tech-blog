package pl.dyjecinski.techblog.web;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.dyjecinski.techblog.domain.article.Article;
import pl.dyjecinski.techblog.domain.article.ArticleService;

import java.util.List;

@Controller
@RequestMapping("/articles")
@AllArgsConstructor
public class ArticlePageController {

    private ArticleService articleService;

    @GetMapping
    public String getArticleList(Model model) {
        List<Article> articles = articleService.getAll();
        model.addAttribute("articles", articles);
        model.addAttribute("articles", articles);
        return "articles";
    }
}
