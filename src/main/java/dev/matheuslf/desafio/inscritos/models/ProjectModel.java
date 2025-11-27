package dev.matheuslf.desafio.inscritos.models;

import dev.matheuslf.desafio.inscritos.dto.ProjectDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;

@Entity(name = "tb_project")
public class ProjectModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "O nome não pode ser nulo")
    @Length(min = 3, max = 100, message = "O nome deve ter entre 3 a 100 caracteres")
    private String name;

    private String description;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    public ProjectModel() {
    }

    public ProjectModel(String name, String description, LocalDateTime startDate, LocalDateTime endDate) {
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public ProjectModel(ProjectDTO projectDTO) {
        this.name = projectDTO.name();
        this.description = projectDTO.description();
        this.startDate = LocalDateTime.now();
        this.endDate = projectDTO.endDate();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }
}
