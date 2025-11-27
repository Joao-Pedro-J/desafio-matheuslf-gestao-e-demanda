package dev.matheuslf.desafio.inscritos.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import java.util.Date;

@Entity(name = "tb_task")
public class TaskModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "O titulo não pode ser nulo")
    @Length(min = 5, max = 150, message = "O titulo deve ter entre 5 a 150 caracteres")
    private String title;

    private String description;

    private StatusTask status;

    private PriorityTask priority;

    private Date dueDate;

    @ManyToOne(targetEntity = ProjectModel.class)
    @JoinColumn(name = "project_id")
    private ProjectModel projectId;

    public TaskModel() {
    }

    public TaskModel(String title, String description, StatusTask status, PriorityTask priority, Date dueDate, ProjectModel projectId) {
        this.title = title;
        this.description = description;
        this.status = status;
        this.priority = priority;
        this.dueDate = dueDate;
        this.projectId = projectId;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public StatusTask getStatus() {
        return status;
    }

    public void setStatus(StatusTask status) {
        this.status = status;
    }

    public PriorityTask getPriority() {
        return priority;
    }

    public void setPriority(PriorityTask priority) {
        this.priority = priority;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public ProjectModel getProjectId() {
        return projectId;
    }

    public void setProjectId(ProjectModel projectId) {
        this.projectId = projectId;
    }
}
