package com.example.Book_Keeper.Repositories;


import com.example.Book_Keeper.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    Student findByEmail(String email);
}
