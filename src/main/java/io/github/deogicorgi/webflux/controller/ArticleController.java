package io.github.deogicorgi.webflux.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @GetMapping("/{id}")
    public Mono<Long> getArticle(@PathVariable Long id){
        return Mono.just(id).log();
    }
}
