package pl.dyjecinski.techblog.web;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.dyjecinski.techblog.domain.article.ArticleService;

@Controller
@AllArgsConstructor
public class HomePageController {

    private ArticleService articleService;

    @GetMapping
    public String home(Model model) {
        model.addAttribute("articles", articleService.getHottest());
        return "home";
    }
}
