package com.rest.demo.repo;

import com.rest.demo.entity.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MovieRepo extends CrudRepository<Movie, Integer>, PagingAndSortingRepository<Movie, Integer> {
    @Override
    Page<Movie> findAll(Pageable pageable);
}
