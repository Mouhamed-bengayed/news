package prj.news.service;

import java.util.List;

import prj.news.model.Categories;

public interface CategoriesService {
    public Categories saveCategories(Categories categories);

    public List<Categories> getAllCategories();

    public Categories getCategories(Long id);
}
