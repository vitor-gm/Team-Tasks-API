package com.example.team_tasks.service;

import com.example.team_tasks.model.TeamTask;
import com.example.team_tasks.repository.TeamTaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamTaskService {

    private final TeamTaskRepository teamTaskRepository;
    public TeamTaskService(TeamTaskRepository teamTaskRepository) {
        this.teamTaskRepository = teamTaskRepository;
    }

    public List<TeamTask> getAll() {
        return teamTaskRepository.findAll();
    }

    public TeamTask createTeamTask(TeamTask teamTask) {
        return teamTaskRepository.save(teamTask);
    }

    public TeamTask updateTeamTask(TeamTask teamTask) {

    }
}