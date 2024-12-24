package com.example.team_tasks.controller;

import com.example.team_tasks.model.TeamTask;
import com.example.team_tasks.repository.TeamTaskRepository;
import com.example.team_tasks.service.TeamTaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/api/team-tasks")
public class TeamTaskController {

    private final TeamTaskService teamTaskService;
    private final TeamTaskRepository teamTaskRepository;

    public TeamTaskController(TeamTaskService taskService, TeamTaskRepository teamTaskRepository) {
        this.teamTaskService = taskService;
        this.teamTaskRepository = teamTaskRepository;
    }

    @PostMapping("/{id}")
    public TeamTask createTeamTask(@RequestBody TeamTask teamTask) {
        return teamTaskService.createTeamTask(teamTask.getId(), teamTask);

    }

    @GetMapping
    public List<TeamTask> getAllTasks() {
        return teamTaskService.getAll();
    }

    @PutMapping({"/id"})
    public ResponseEntity<TeamTask> updateTeamTask(@PathVariable Long id, @RequestBody TeamTask teamTaskDetails) {
        TeamTask updatedTask = teamTaskService.updateTeamTask(id, teamTaskDetails);
        return ResponseEntity.ok(updatedTask);
    }



}
