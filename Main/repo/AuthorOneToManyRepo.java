package com.example.demo.repo;

import com.example.demo.entities.OneToManyUnidirectional.AuthorOneToManyUniDirectional;
import org.springframework.data.repository.CrudRepository;

public interface AuthorOneToManyRepo extends CrudRepository<AuthorOneToManyUniDirectional, Integer> {
}
