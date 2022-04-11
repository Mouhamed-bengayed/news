package prj.news.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prj.news.model.Categories;
import prj.news.repository.CategoriesRepo;

@Service
public class CategoriesServiceImpl implements CategoriesService {
    @Autowired
    private CategoriesRepo categoriesRepo;

    @Override
    public Categories saveCategories(Categories categories) {

        return categoriesRepo.save(categories);
    }

    @Override
    public List<Categories> getAllCategories() {
        return categoriesRepo.findAll();
    }

    @Override
    public Categories getCategories(Long id) {
        Optional<Categories> categories = categoriesRepo.findById(id);
        if (categories.isPresent()) {
            return categories.get();
        }
        throw new RuntimeException("categories is not found for the id " + id);
    }
}
