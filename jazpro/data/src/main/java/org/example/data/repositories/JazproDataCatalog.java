package org.example.data.repositories;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@Getter
public class JazproDataCatalog {

    private final CompanyRepository companies;
    private final AnimeRepository anime;
    private final ActorRepository actors;
    private final CharacterRepository character;
    private final GenereRepository genres;

}
