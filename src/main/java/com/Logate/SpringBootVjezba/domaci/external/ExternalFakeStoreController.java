package com.Logate.SpringBootVjezba.domaci.external;

import com.Logate.SpringBootVjezba.DTO.PostDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.domain.AbstractAuditable_;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/external")
public class ExternalFakeStoreController {

    @Autowired
    private ExternalFakeStoreService externalFakeStoreService;

    @GetMapping
    public ResponseEntity<List<ProductDTO>> getAllProducts() {
        List<ProductDTO> products = externalFakeStoreService.getAllProducts();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping(value="all-categories")
    public ResponseEntity<List<CategoriesDTO>> getAllCategories() {
        List<CategoriesDTO> categories = externalFakeStoreService.getAllCategories();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @PostMapping(value = "new-product")
    public ResponseEntity<ProductDTO> addANewProduct(@RequestBody ProductDTO productDTO){
        ProductDTO product = externalFakeStoreService.createANewProduct(productDTO);
        if(product != null) {
            return new ResponseEntity<>(product, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping(value = "/products/{id}")
    public ResponseEntity<ProductDTO> getASingleProduct(@PathVariable Integer id) {
        ProductDTO product = externalFakeStoreService.getASingleProduct(id);
        if(product != null) {
            return new ResponseEntity<>(product, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

}
