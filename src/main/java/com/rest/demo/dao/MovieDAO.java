package com.rest.demo.dao;

import com.rest.demo.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface MovieDAO extends JpaRepository<Movie, Integer>, PagingAndSortingRepository<Movie, Integer> {
}
