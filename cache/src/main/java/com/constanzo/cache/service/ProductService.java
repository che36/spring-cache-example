package com.constanzo.cache.service;

import com.constanzo.cache.entity.Product;
import com.constanzo.cache.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;

    @Cacheable("product-cache")
    public List<Product> listAll() throws InterruptedException {
        log.info("c=ProductProductService,m=listAll");
        return productRepository.listAll();
    }
}
