package tp.example.store.rest;

import tp.example.store.bo.ArticleService;
import tp.example.store.bo.Article;
import tp.example.store.bo.ResponseCode;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArticleRestController {
    private final ArticleService articleService;

    public ArticleRestController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/article")
    public ResponseCode<List<Article>> getAll(){
        return articleService.getAll();
    }

    @GetMapping("/article/{id}")
    public ResponseCode<Article> getArticle(@PathVariable("id") Long id) {
        return articleService.getArticle(id);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseCode<Boolean> deleteArticle(@PathVariable("id") Long id){
        return articleService.deleteArticle(id);
    }

    @PostMapping("/save")
    public ResponseCode<Article> saveArticle(@RequestBody Article article){
        return articleService.saveArticle(article);
    }
}