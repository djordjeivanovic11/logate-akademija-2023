package com.Logate.SpringBootVjezba.vjezbaSaCasa;

import com.Logate.SpringBootVjezba.domaci.external.ProductDTO;
import com.Logate.SpringBootVjezba.domaci2.entities.Category;
import com.Logate.SpringBootVjezba.domaci2.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

@Service
public class CategoryService {
    /*

    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> listAllCategories() {
        return categoryRepository.listAllCategories();
    }

    public List<Product> listAllProductsFromCategory(String name) {
        return categoryRepository.listAllProductsFromCategory(name);
    }

    public Product createNewProduct(Product product) {
        return categoryRepository.save(product);
    }

    /*public Map<Product, Category> createNewProductWithcategory(Product product) {
        Map<Product, Category> categoryProduct = new HashMap<>();
        Category category = product.getCategory();
        categoryProduct.put(product, category);
        categoryRepository.save();
    }*/
}
