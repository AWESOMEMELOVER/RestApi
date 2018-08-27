package com.micka.borscha.kotlindemo.Controllers


import com.micka.borscha.kotlindemo.Entities.Article
import org.springframework.web.bind.annotation.*
import com.micka.borscha.kotlindemo.Repositories.*
import javax.validation.Valid


@RestController
@RequestMapping("/api")
class ArticleController(private val articleRepository: ArticlesRepository) {

   @GetMapping("/articles")
   fun getAllArticles(): List<Article> = articleRepository.findAll()

    @PostMapping("/articles")
    fun createNewArticle(@Valid @RequestBody article: Article):Article{
        articleRepository.save(article)
        return article
    }
}