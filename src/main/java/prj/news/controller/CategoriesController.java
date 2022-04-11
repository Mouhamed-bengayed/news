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

import prj.news.model.Categories;
import prj.news.service.CategoriesService;

@RestController
@CrossOrigin
@RequestMapping("/categories")
public class CategoriesController {
    @Autowired
    private CategoriesService categoriesService;

    @PostMapping("/add")
    public String add(@RequestBody Categories categories) {
        categoriesService.saveCategories(categories);
        return "new is Categories added";
    }

    @GetMapping("/getAll")
    public List<Categories> getAlCategories() {
        return categoriesService.getAllCategories();
    }

    @GetMapping("/get/{id}")
    public Categories getCategories(@PathVariable Long id) {
        return categoriesService.getCategories(id);
    }
}
