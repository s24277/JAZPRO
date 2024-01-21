package org.example.data.repositories;

public interface ICatalogData {
    CompanyRepository getCompanies();
    AnimeRepository getAnime();
    ActorRepository getActors();
    CharacterRepository getCharacters();
    GenereRepository getGeneres();

}
