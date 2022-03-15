package com.example.demo.repo;

import com.example.demo.entities.manytomany.Bookmanymapping;
import org.springframework.data.repository.CrudRepository;

public interface BookManyToManyRepo extends CrudRepository<Bookmanymapping,Integer> {
}
