package pl.dyjecinski.techblog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pl.dyjecinski.techblog.domain.article.ArticleService;

@Controller
public class HomePageController {

    private ArticleService articleService;

    @GetMapping
    public String home() {
        return "home";
    }
}
