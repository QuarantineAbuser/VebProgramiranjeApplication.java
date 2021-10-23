package mk.ukim.finki.vebprogramiranje.service;

import mk.ukim.finki.vebprogramiranje.model.Category;

import java.util.List;


public interface CategoryService {

    public Category create(String name, String description);

    public Category update(String name, String description);

    public void delete(String name);

    public List<Category> listCategories();

    public List<Category> searchCategories(String searchText);

}
