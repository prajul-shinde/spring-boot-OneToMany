package com.csi.one.to.many.service;

import com.csi.one.to.many.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class ProductService{

    @Autowired
    private ProductRepository productRepository;
}
