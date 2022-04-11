package prj.news.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import prj.news.model.News;

@Repository
public interface NewsRepo extends JpaRepository<News, Long> {

}
