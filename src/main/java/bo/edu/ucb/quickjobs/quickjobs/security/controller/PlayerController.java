package bo.edu.ucb.quickjobs.quickjobs.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import bo.edu.ucb.quickjobs.quickjobs.security.model.*;
import bo.edu.ucb.quickjobs.quickjobs.security.repository.PlayerRepository;

import java.util.List;

@RestController
@RequestMapping("/api/players")
public class PlayerController {

    @Autowired
    private PlayerRepository playerRepository;

    @GetMapping("")
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    @PostMapping("")
    public Player addPlayer(@RequestBody Player player) {
        return playerRepository.save(player);
    }

    @PutMapping("/{id}")
    public Player updatePlayer(@PathVariable Long id, @RequestBody Player playerDetails) throws Exception {
        Player player = playerRepository.findById(id).orElseThrow(() -> new Exception("Jugador no encontrado"));

        player.setName(playerDetails.getName());
        player.setAge(playerDetails.getAge());
        player.setTeam(playerDetails.getTeam());

        return playerRepository.save(player);
    }

    @DeleteMapping("/{id}")
    public void deletePlayer(@PathVariable Long id) {
        playerRepository.deleteById(id);
    }
}