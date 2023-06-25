package com.Logate.SpringBootVjezba.Domaci3.controllers;

import com.Logate.SpringBootVjezba.Domaci3.dto.CategoryDTO;
import com.Logate.SpringBootVjezba.Domaci3.dto.ProductDTO;
import com.Logate.SpringBootVjezba.Domaci3.services.CategoryService;
import com.Logate.SpringBootVjezba.Domaci3.services.ProductService;
import com.Logate.SpringBootVjezba.domaci2.entities.Category;
import com.Logate.SpringBootVjezba.domaci2.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;

@RestController
@RequestMapping(value="api/categories")
class CategoryAndProductController {

    @Autowired
    CategoryService categoryService;

    @Autowired
    ProductService productService;


    @GetMapping
    public ResponseEntity<List<CategoryDTO>> listAllCategories() {
        List<CategoryDTO> categories = categoryService.listAllCategories();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @GetMapping("products-from-category")
    public ResponseEntity<List<ProductDTO>> listAllProductsFromCategory(@RequestParam String name) {
        List<ProductDTO> products = productService.listAllProductsFromCategory(name);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("products-from-category")
    public ResponseEntity<List<ProductDTO>> listAllProductsFromCategoryWithPagination(@RequestParam String name, Pageable pageable) {
        List<ProductDTO> products = productService.listAllProductsFromCategoryWithPagination(name, pageable);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @PostMapping("create-a-product")
    public ResponseEntity<Void> createNewProduct(@RequestBody ProductDTO product, @RequestBody CategoryDTO category) {
        Void productSaved = productService.createNewProduct(product, category);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("update-a-product")
    public ResponseEntity<ProductDTO> updateProduct(@RequestBody ProductDTO productDTO) {
        ProductDTO product = productService.updateProduct(productDTO);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }


    @DeleteMapping("delete-a-category-and-products")
    public ResponseEntity<CategoryDTO> deleteCategory(@RequestBody Integer id) {
        CategoryDTO category = productService.deleteCategory(id);
        return new ResponseEntity<>(category, HttpStatus.OK);
    }


}






