package com.Logate.SpringBootVjezba.Domaci3.services;

import com.Logate.SpringBootVjezba.Domaci3.dto.CategoryDTO;
import com.Logate.SpringBootVjezba.Domaci3.dto.ProductDTO;
import com.Logate.SpringBootVjezba.Domaci3.maps.CategoryMapper;
import com.Logate.SpringBootVjezba.Domaci3.repositories.CategoryRepository;
import com.Logate.SpringBootVjezba.domaci2.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    CategoryMapper categoryMapper;

    public List<CategoryDTO> listAllCategories() {
        List<Category> categories = categoryRepository.listAllCategories();
        List<CategoryDTO> categoriesDTO = new ArrayList<>();
        for(Category category: categories){
            categoriesDTO.add(categoryMapper.convertCategoryToCategoryDTO(category));
        }
        return categoriesDTO;
    }


}
