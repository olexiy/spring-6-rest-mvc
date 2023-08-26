package de.olexiy.spring6restmvc.repositories;

import de.olexiy.spring6restmvc.entities.Beer;
import de.olexiy.spring6restmvc.model.BeerStyle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BeerRepository extends JpaRepository<Beer, UUID> {
    List<Beer> findAllByBeerNameLikeIgnoreCase(String beerName);

    List<Beer> findAllByBeerStyle(BeerStyle beerStyle);

    List<Beer> findAllByBeerNameLikeIgnoreCaseAndBeerStyle(String beerName, BeerStyle beerStyle);
}

