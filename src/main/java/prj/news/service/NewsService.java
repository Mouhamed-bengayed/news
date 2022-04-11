package prj.news.service;

import java.util.List;

import prj.news.model.News;

public interface NewsService {

    public News saveNews(News news);

    public List<News> getAllNews();

    public News getNews(Long id);
}
