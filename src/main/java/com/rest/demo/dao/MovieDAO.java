package com.rest.demo.dao;

import com.rest.demo.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MovieDAO extends JpaRepository<Movie, Integer> {
}
