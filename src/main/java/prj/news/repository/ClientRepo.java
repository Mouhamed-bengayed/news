package prj.news.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import prj.news.model.Client;

@Repository
public interface ClientRepo extends JpaRepository<Client, Long> {

}
