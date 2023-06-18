package com.Logate.SpringBootVjezba.domaci.external;

import com.Logate.SpringBootVjezba.domaci.dto.MovieDTO;
import org.apache.catalina.connector.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.data.repository.query.ReturnedType;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class ExternalFakeStoreService {

    @Value("{external-fake-store-api.url}")
    String url;

    @Autowired
    private RestTemplate restTemplate;

    public List<ProductDTO> getAllProducts() {
        ParameterizedTypeReference<List<ProductDTO>> parameterizedTypeReference = new ParameterizedTypeReference<>(){};
        ResponseEntity<List<ProductDTO>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                parameterizedTypeReference
        );
        List<ProductDTO> listOfProducts = response.getBody();
        return listOfProducts;
    }

    public List<CategoriesDTO> getAllCategories() {
        String newUrl = "https://fakestoreapi.com/products/categories";
        ParameterizedTypeReference<List<CategoriesDTO>> parameterizedTypeReference = new ParameterizedTypeReference<>(){};
        ResponseEntity<List<CategoriesDTO>> response = restTemplate.exchange(
                newUrl,
                HttpMethod.GET,
                null,
                parameterizedTypeReference
        );
        List<CategoriesDTO> listOfCategories = response.getBody();

        return listOfCategories;
    }

    public ProductDTO createANewProduct(ProductDTO productDTO) {
        String url = "https://fakestoreapi.com/products";
        Logger LOGGER = LoggerFactory.getLogger(ExternalFakeStoreService.class);
        HttpEntity httpEntity = new HttpEntity<>(productDTO){};
        try{
            ResponseEntity<ProductDTO> response = restTemplate.exchange(url, HttpMethod.POST, httpEntity, ProductDTO.class );
            return response.getBody();
        }
        catch(Exception e){
            LOGGER.info("greska: {}", e.getMessage());

        }

        return null;

    }

    public ProductDTO getASingleProduct(Integer id) {
        String urlNew = "https://fakestoreapi.com/products" + "/" + id;
        ResponseEntity<ProductDTO> product = restTemplate.exchange(urlNew, HttpMethod.GET, null, ProductDTO.class);
        return product.getBody();
    }
}
