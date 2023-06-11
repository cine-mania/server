package com.moviemania.server.service.impls;

import com.moviemania.server.model.Theatre;
import com.moviemania.server.payload.TheatreDto;
import com.moviemania.server.repository.TheatreRepository;
import com.moviemania.server.service.TheatreService;
import org.springframework.stereotype.Service;

@Service
public class TheatreServiceImpls implements TheatreService {

      private TheatreRepository theatreRepository;

    public TheatreServiceImpls(TheatreRepository theatreRepository) {
        this.theatreRepository = theatreRepository;
    }


    public TheatreDto addTheatre(TheatreDto theatreDto) {

         Theatre theatre=mapToEntity(theatreDto);
        System.out.println(theatre.getManagerContact());
        Theatre newTheatre=theatreRepository.save(theatre);
        return mapToDto(newTheatre);
    }

    @Override
    public void deleteTheatre(Integer id) {
        try {
            theatreRepository.deleteById(id);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return ;
    }

    private TheatreDto mapToDto(Theatre theatre)
    {
        TheatreDto theatreDto=new TheatreDto();
        theatreDto.setTheaterId(theatre.getTheaterId());
        theatreDto.setTheaterName(theatre.getTheaterName());
        theatreDto.setManagerName(theatre.getManagerName());
        theatreDto.setManagerContact(theatre.getManagerContact());
        theatreDto.setTheaterCity(theatre.getTheaterCity());

        return theatreDto;
    }

    private Theatre mapToEntity(TheatreDto theatreDto)
    {
          Theatre theatre=new Theatre();
          theatre.setTheaterId(theatreDto.getTheaterId());
          theatre.setTheaterName(theatreDto.getTheaterName());
          theatre.setManagerName(theatreDto.getManagerName());
          theatre.setManagerContact(theatreDto.getManagerContact());
          theatre.setTheaterCity(theatreDto.getTheaterCity());
       return  theatre;
     }
}
