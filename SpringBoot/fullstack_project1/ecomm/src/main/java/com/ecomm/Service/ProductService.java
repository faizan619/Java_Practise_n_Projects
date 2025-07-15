package com.ecomm.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.ecomm.Model.Product;
import com.ecomm.Repo.ProductRepo;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Product getProductById(int id){
        return repo.findById(id).orElse(null);
        // return repo.findById(id).get();
    }

    // public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
    public Product addProduct(Product product, MultipartFile imageFile) {
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        product.setImageData(imageFile.getBytes()); 
        return repo.save(product);
    }

    public Product updateProduct(int id, Product product, MultipartFile imageFile) throws IOException{
    // public Product updateProduct(int id, Product product, MultipartFile imageFile){
        product.setImageData(imageFile.getBytes());
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        return repo.save(product);
    }
    
}
