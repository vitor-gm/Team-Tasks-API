CREATE DATABASE team_tasks;
USE team_tasks;
CREATE TABLE Tasks (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    completed BOOLEAN NOT NULL
);