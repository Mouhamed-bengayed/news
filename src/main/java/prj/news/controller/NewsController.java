package prj.news.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import prj.news.model.News;
import prj.news.service.NewsService;

@RestController
@CrossOrigin
@RequestMapping("/news")
public class NewsController {
    @Autowired
    private NewsService newsService;

    @PostMapping("/add")
    public String add(@RequestBody News news) {
        newsService.saveNews(news);
        return "new is news added";
    }

    @GetMapping("/getAll")
    public List<News> getAlNews() {
        return newsService.getAllNews();
    }

    @GetMapping("/get/{id}")
    public News getNews(@PathVariable Long id) {
        return newsService.getNews(id);
    }
}
