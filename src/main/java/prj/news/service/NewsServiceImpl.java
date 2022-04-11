package prj.news.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prj.news.model.News;
import prj.news.repository.NewsRepo;

@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsRepo newsRepo;

    @Override
    public News saveNews(News news) {

        return newsRepo.save(news);
    }

    @Override
    public List<News> getAllNews() {
        return newsRepo.findAll();
    }

    @Override
    public News getNews(Long id) {
        Optional<News> news = newsRepo.findById(id);
        if (news.isPresent()) {
            return news.get();
        }
        throw new RuntimeException("News is not found for the id " + id);
    }
}
