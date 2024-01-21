package org.example.data.repositories;

import org.example.data.model.Anime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AnimeRepository extends JpaRepository<Anime,Long> {
    @Query("select anime from Anime anime join fetch anime.genres where anime.id=:id")
    Anime findAllWithRoles(@Param("id")long id);
}
