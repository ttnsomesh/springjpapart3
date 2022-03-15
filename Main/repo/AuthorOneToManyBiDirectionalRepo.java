package com.example.demo.repo;

import com.example.demo.entities.OneToManyBiDirectional.AuthorOneToManyBiDirectional;
import org.springframework.data.repository.CrudRepository;

public interface AuthorOneToManyBiDirectionalRepo extends CrudRepository<AuthorOneToManyBiDirectional, Integer> {
}
