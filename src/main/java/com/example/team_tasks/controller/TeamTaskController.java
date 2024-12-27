package com.example.team_tasks.controller;

import com.example.team_tasks.model.TeamTask;
import com.example.team_tasks.repository.TeamTaskRepository;
import com.example.team_tasks.service.TeamTaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/api/team-tasks")
public class TeamTaskController {

    private final TeamTaskService teamTaskService;

    public TeamTaskController(TeamTaskService teamTaskService) {
        this.teamTaskService = teamTaskService;

    }

    @PostMapping
    public TeamTask createTeamTask(@RequestBody TeamTask teamTask) {
        return teamTaskService.createTeamTask(teamTask);

    }

    @GetMapping
    public List<TeamTask> getAllTasks() {
        return teamTaskService.getAll();
    }

    @PutMapping("/{id}")
    public ResponseEntity<TeamTask> updateTeamTask(@PathVariable Long id, @RequestBody TeamTask teamTaskDetails) {
        TeamTask updatedTask = teamTaskService.updateTeamTask(id, teamTaskDetails);
        return ResponseEntity.ok(updatedTask);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Optional<TeamTask>> deleteTeamTask(@PathVariable Long id) {
        Optional<TeamTask> taskDeleted = teamTaskService.getTeamTaskById(id);
        teamTaskService.deleteTeamTask(id);
        return ResponseEntity.ok(taskDeleted);


    }



}
