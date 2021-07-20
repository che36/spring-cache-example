package com.constanzo.cache.repository;

import com.constanzo.cache.entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

import static java.lang.Thread.sleep;

@Component
@Slf4j
public class ProductRepository {
    public List<Product> listAll() throws InterruptedException {
        log.info("c=ProductRepository,m=listAll");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Acesso ao banco de dados e retornando a lista;
        final Product product1 = Product.builder()
                .sku("produto123")
                .price(new BigDecimal("10.00"))
                .description("Produto 1")
                .build();

        final Product product2 = Product.builder()
                .sku("produto987")
                .price(new BigDecimal("8.00"))
                .description("Produto 2")
                .build();

        List<Product> products = List.of(product1, product2);
        return products;
    }
}
