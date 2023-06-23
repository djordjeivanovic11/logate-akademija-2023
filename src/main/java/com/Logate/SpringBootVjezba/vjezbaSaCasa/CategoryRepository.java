package com.Logate.SpringBootVjezba.vjezbaSaCasa;

import com.Logate.SpringBootVjezba.domaci.external.ProductDTO;
import com.Logate.SpringBootVjezba.domaci2.entities.Category;
import com.Logate.SpringBootVjezba.domaci2.entities.Product;
import com.Logate.SpringBootVjezba.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface CategoryRepository extends JpaRepository<Product, Integer>{
    /*

    @Query(value = "select category from Category category")
    List<Category> listAllCategories();

    @Query(value = "select product from Product product " +
            "join product.category " +
            "where category.name = : name")
    List<Product> listAllProductsFromCategory(@Param("name") String name);



    @Modifying
    @Query(value="insert product into Product product")
    Map<Product, Category> createNewProductWithcategory(ProductDTO productDTO);

*/
}
