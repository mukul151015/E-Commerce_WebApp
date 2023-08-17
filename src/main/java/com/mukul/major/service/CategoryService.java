package com.mukul.major.service;

import com.mukul.major.model.Category;
import com.mukul.major.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;
    public void addCategory(Category category){
        categoryRepository.save(category);
    }

    public void  removeCategoryById(int id){
       categoryRepository.deleteById(id);
    }

    public Optional<Category> fetchCategoryById(int id){
        return categoryRepository.findById(id);
    }


    public List<Category> getAllCategory(){
        return categoryRepository.findAll();
    }
}
