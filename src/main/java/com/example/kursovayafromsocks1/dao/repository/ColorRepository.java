package com.example.kursovayafromsocks1.dao.repository;


import com.example.kursovayafromsocks1.model.Color;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColorRepository extends JpaRepository<Color, Integer> {
    Color findColorByName(String name);
}
