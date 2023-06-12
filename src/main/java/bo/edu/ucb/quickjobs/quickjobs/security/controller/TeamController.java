package bo.edu.ucb.quickjobs.quickjobs.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import bo.edu.ucb.quickjobs.quickjobs.security.model.*;
import bo.edu.ucb.quickjobs.quickjobs.security.repository.TeamRepository;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/teams")
public class TeamController {

    @Autowired
    private TeamRepository teamRepository;

    @GetMapping("")
    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    @PostMapping("")
    public Team addTeam(@RequestBody Team team) {
        return teamRepository.save(team);
    }

    @PutMapping("/{id}")
    public Team updateTeam(@PathVariable Long id, @RequestBody Team teamDetails) throws Exception {
        Team team = teamRepository.findById(id).orElseThrow(() -> new Exception("Equipo no encontrado"));

        team.setName(teamDetails.getName());
        team.setStadium(teamDetails.getStadium());
        team.setCity(teamDetails.getCity());

        return teamRepository.save(team);
    }

    @DeleteMapping("/{id}")
    public void deleteTeam(@PathVariable Long id) {
        teamRepository.deleteById(id);
    }
}