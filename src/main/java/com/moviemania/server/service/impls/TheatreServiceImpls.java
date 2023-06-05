package com.moviemania.server.service.impls;

import com.moviemania.server.model.Theatre;
import com.moviemania.server.payload.TheatreDto;
import com.moviemania.server.repository.TheatreRepository;
import com.moviemania.server.service.TheatreService;

public class TheatreServiceImpls implements TheatreService {

      private TheatreRepository theatreRepository;

    public TheatreServiceImpls(TheatreRepository theatreRepository) {
        this.theatreRepository = theatreRepository;
    }

    @Override
    public TheatreDto addTheatre(TheatreDto theatreDto) {

         Theatre theatre=mapToEntity(theatreDto);
         Theatre newTheatre=theatreRepository.save(theatre);
        return mapToDto(newTheatre);
    }

    private TheatreDto mapToDto(Theatre theatre)
    {
        TheatreDto theatreDto=new TheatreDto();
        theatreDto.setTheaterId(theatre.getTheaterId());
        theatreDto.setTheaterName(theatre.getTheaterName());
        theatreDto.setManagerName(theatre.getManagerName());
        theatreDto.setManagerContact(theatre.getManagerContact());

        return theatreDto;
    }

    private Theatre mapToEntity(TheatreDto theatreDto)
    {
          Theatre theatre=new Theatre();
          theatre.setTheaterId(theatreDto.getTheaterId());
          theatre.setTheaterName(theatreDto.getTheaterName());
          theatre.setManagerName(theatre.getManagerName());
          theatre.setManagerContact(theatre.getManagerContact());
       return  theatre;
     }
}
