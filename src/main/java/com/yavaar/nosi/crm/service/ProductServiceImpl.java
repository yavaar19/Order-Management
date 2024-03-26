package com.yavaar.nosi.crm.service;

import com.yavaar.nosi.crm.dao.ProductDao;
import com.yavaar.nosi.crm.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductDao productDao;

    @Override
    public Optional<Product> findProductById(long id) {
        return productDao.findById(id);
    }

    @Override
    public Product saveProduct(Product product) {
        return productDao.save(product);
    }

    @Override
    public List<Product> findAllProducts() {
        return productDao.findAll();
    }

    @Override
    public void updateProduct(Product product) {

        productDao.save(product);

    }

    @Override
    public void deleteProductById(long id) {

        productDao.deleteById(id);

    }

    @Override
    public boolean checkIfProductIsNull(long id) {

        Optional<Product> foundProduct = findProductById(id);

        return foundProduct.isEmpty();

    }

}
