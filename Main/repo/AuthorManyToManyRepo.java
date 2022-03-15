package com.example.demo.repo;

import com.example.demo.entities.manytomany.Authormanymapping;
import org.springframework.data.repository.CrudRepository;

public interface AuthorManyToManyRepo extends CrudRepository<Authormanymapping, Integer> {
}
