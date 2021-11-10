package net.guides.springboottodomanagement.repository;

import java.util.List;

import net.guides.springboottodomanagement.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TodoRepository extends JpaRepository <Todo, Long > {
    List < Todo > findByUserName(String user);
}