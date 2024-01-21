package org.example.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CharacterRepository extends JpaRepository<Character,Long> {
    @Query("select cr from Character cr where cr.anime.id = :movieId")
    List<Character> getActorsFromMovie(@Param("movieId")long id);
}
