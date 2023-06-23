package com.Logate.SpringBootVjezba.vjezbaSaCasa;

import com.Logate.SpringBootVjezba.domaci.external.ProductDTO;
import com.Logate.SpringBootVjezba.domaci2.entities.Category;
import com.Logate.SpringBootVjezba.domaci2.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value="api/categories")
class Controller {
    /*

    @Autowired
    CategoryService categoryService;
    @GetMapping
    public ResponseEntity<List<Category>> listAllCateories(){
        List<Category> categories = categoryService.listAllCategories();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @GetMapping("category-name")
    public ResponseEntity<List<Product>> listAllProductsFromCategory(@RequestParam String name){
        List<Product> products = categoryService.listAllProductsFromCategory(name);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> createNewProduct(@RequestBody Product product){
        Product productSave = categoryService.createNewProduct(product);
        return new ResponseEntity<>(HttpStatus.OK);
    }

   /* @PostMapping
    public ResponseEntity<Map<Product, Category>> createNewProductWithCategory(@RequestBody Product product){
        Map<Product, Category> product1 = categoryService.createNewProductWithcategory(product);
        return new ResponseEntity<>(product1, HttpStatus.OK);*/
    }






