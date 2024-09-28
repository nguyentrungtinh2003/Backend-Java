package com.TrungTinhFullStack.Backend_Java.Repository;

import com.TrungTinhFullStack.Backend_Java.Entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Long> {
}
