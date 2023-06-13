package com.moviemania.server.service.impls;

import com.moviemania.server.model.Screen;
import com.moviemania.server.payload.ScreenDto;
import com.moviemania.server.repository.ScreenRepository;
import com.moviemania.server.service.ScreenService;
import org.springframework.stereotype.Service;

@Service
public class ScreenServiceImpls implements ScreenService {

    private ScreenRepository screenRepository;

    public ScreenServiceImpls(ScreenRepository screenRepository) {
        this.screenRepository = screenRepository;
    }

    @Override
    public ScreenDto addScreen(ScreenDto screenDto) {
        Screen screen=mapToEntity(screenDto);
        Screen newScreen=screenRepository.save(screen);
        return mapToDto(newScreen);
    }

    @Override
    public void deleteScreen(long id) {
        try {
            screenRepository.deleteById(id);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return;

    }

    private ScreenDto mapToDto(Screen screen)
   {
       ScreenDto screenDto=new ScreenDto();
       screenDto.setScreenId(screen.getScreenId());
       screenDto.setScreenName(screen.getScreenName());
       screenDto.setNumberOfcolumns(screen.getNumberOfcolumns());
       screenDto.setNumberOfrows(screen.getNumberOfrows());
       screenDto.setMovieEndDate(screen.getMovieEndDate());

       return screenDto;
   }
   private Screen mapToEntity(ScreenDto screenDto)
   {
       Screen screen=new Screen();
       screen.setScreenId(screenDto.getScreenId());
       screen.setScreenName(screenDto.getScreenName());
       screen.setNumberOfrows(screen.getNumberOfrows());
       screen.setNumberOfcolumns(screen.getNumberOfcolumns());
       screen.setMovieEndDate(screenDto.getMovieEndDate());

       return screen;
   }
}
