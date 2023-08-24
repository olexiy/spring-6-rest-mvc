package de.olexiy.spring6restmvc.mappers;

import de.olexiy.spring6restmvc.entities.Beer;
import de.olexiy.spring6restmvc.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDTO dto);
    BeerDTO beerToBeerDto(Beer beer);

}
