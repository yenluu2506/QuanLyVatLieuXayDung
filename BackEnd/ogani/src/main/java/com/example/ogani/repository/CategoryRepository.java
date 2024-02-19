package com.example.ogani.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.ogani.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
    
    @Query(value = "Select * from Category WHERE enable = 1", nativeQuery = true)
    List<Category> findALLByEnabled();
}
