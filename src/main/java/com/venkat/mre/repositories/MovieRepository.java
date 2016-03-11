package com.venkat.mre.repositories;

import org.springframework.data.repository.CrudRepository;

import com.venkat.mre.domain.Movie;

public interface MovieRepository extends CrudRepository<Movie,Long>{

}
