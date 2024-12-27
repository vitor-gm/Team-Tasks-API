package com.example.team_tasks.model;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "TeamTask")
@Table(name = "TeamTask")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class TeamTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private boolean completed;
}
