package crud.practise.praco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PracoController {

    @Autowired
    private PracoService pracoService;

    @RequestMapping("/players")
    public List<Players> getPlayers(){
        return pracoService.getPlayers();
    }

    @RequestMapping("/players/{id}")
    public Optional<Players> getAPLayer(@PathVariable Integer id){
        return pracoService.getAPLayer(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/players/")
    public void registerPlayer(@RequestBody Players player){
        pracoService.registerPlayer(player);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/players/{id}")
    public void updatePlayer(@RequestBody Players player){
        pracoService.updatePlayer(player);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/playersID/{id}")
    public void updatePlayerID(@PathVariable Integer id ,@RequestBody Players player){
        pracoService.updatePlayerID(id, player);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/players/{id}")
    public void deletePLayer(@PathVariable Integer id){
        pracoService.deletePLayer(id);
    }
}
