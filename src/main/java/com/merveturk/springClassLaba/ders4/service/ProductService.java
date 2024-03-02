package com.merveturk.springClassLaba.ders4.service;


import com.merveturk.springClassLaba.ders4.dto.ProductDTO;
import com.merveturk.springClassLaba.ders4.mapper.ProductMapper;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.management.Query;
import java.util.List;

@Service
public class ProductService {

    private final JdbcTemplate jdbcTemplate;
    // private final ProductDTO productDto;


    public ProductService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save() {

    }


    public List<ProductDTO> getProductByCategory(String productCategory) {

        List<ProductDTO> query = jdbcTemplate.query("SELECT * FROM PRODUCTT s WHERE s.CATEGORY = ? ", new Object[]{productCategory}, new ProductMapper());

        return query;

    }

   /* public List<ProductDTO> getProductByCategory (String productCategory)
    {
        //.query olarak gelen metod içinden rowmapper olanı seçtim.
        List<ProductDTO> query = jdbcTemplate.query("SELECT * FROM PRODUCTT P WHERE P.CATEGORY = '?' ", new Object[]{productCategory}, new ProductMapper()) ;
        return query;

    }*/


}
