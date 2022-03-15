package com.example.demo.repo;

import com.example.demo.entities.OnetoOne.Bookonemapping;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Bookonemapping, Integer> {
}
