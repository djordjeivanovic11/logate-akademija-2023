package com.Logate.SpringBootVjezba.Domaci3.services;

import com.Logate.SpringBootVjezba.Domaci3.dto.CategoryDTO;
import com.Logate.SpringBootVjezba.Domaci3.maps.CategoryMapper;
import com.Logate.SpringBootVjezba.Domaci3.maps.ProductMapper;
import com.Logate.SpringBootVjezba.Domaci3.repositories.CategoryRepository;
import com.Logate.SpringBootVjezba.Domaci3.repositories.ProductRepository;
import com.Logate.SpringBootVjezba.domaci2.entities.Category;
import com.Logate.SpringBootVjezba.Domaci3.dto.ProductDTO;
import com.Logate.SpringBootVjezba.domaci2.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestBody;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService {

    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    ProductMapper productMapper;
    @Autowired
    ProductRepository productRepository;

    @Autowired
    CategoryMapper categoryMapper;


    public List<ProductDTO> listAllProductsFromCategory(String name) {
        List<Product> products = productRepository.listAllProductsFromCategory(name);
        List<ProductDTO> productsDTO = new ArrayList<>();
        for(Product product : products){
            productsDTO.add(productMapper.convertProductToProductDTO(product));
        }
        return productsDTO;
    }

    public List<ProductDTO> listAllProductsFromCategoryWithPagination(String name, Pageable pageable) {
        List<Product> products = productRepository.listAllProductsFromCategoryWithPagination(name, pageable).getContent();
        List<ProductDTO> productsDTO = new ArrayList<>();
        for(Product product : products){
            productsDTO.add(productMapper.convertProductToProductDTO(product));
        }
        return productsDTO;
    }

    public Void createNewProduct(ProductDTO productDTO, CategoryDTO categoryDTO) {
        Product product = productMapper.convertProductDTOToProduct(productDTO);
        Category category = categoryMapper.convertCategoryDTOToCategory(categoryDTO);
        if(category.getProducts()==null){
            product.setCategory(category);
            List<Product> products = category.getProducts();
            products.add(product);
            categoryRepository.save(category);
            productRepository.save(product);
        }
        else {
            categoryRepository.save(category);
            product.setCategory(category);
            productRepository.save(product);
        }

        return null;

    }


    public ProductDTO updateProduct(ProductDTO productDTO) {
        Product product = productMapper.convertProductDTOToProduct(productDTO);
        productRepository.save(product);
        return productDTO;
    }

    public CategoryDTO deleteCategory(Integer id) {
        CategoryDTO categoryDTO = categoryMapper.convertCategoryToCategoryDTO(categoryRepository.getById(id));
        categoryRepository.deleteById(id);
        return categoryDTO;
    }
}
