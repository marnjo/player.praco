package crud.practise.praco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PracoService {

    @Autowired
    private PracoRepository pracoRepository;

    public List<Players> getPlayers(){
        List<Players> players = new ArrayList<>();
        pracoRepository.findAll().forEach(players::add);
        return players;
    }

    public Optional<Players> getAPLayer(Integer id){
        return pracoRepository.findById(id);
    }

    public String registerPlayer(Players player){
        pracoRepository.save(player);
        return "Player successfully saved";
    }

    public String updatePlayer(Players player){
        pracoRepository.save(player);
        return "Player successfully updated";
    }

    public String updatePlayerID(Integer id, Players player){
        pracoRepository.save(player);
        return "yes id put";
    }

    public String deletePLayer(Integer id){
        pracoRepository.deleteById(id);
        return "Player successfully deleted";
    }
}
