package dev.matheuslf.desafio.inscritos.dto;

import java.time.LocalDateTime;
import java.util.Date;

public record ProjectDTO (
    String name,
    String description,
    LocalDateTime startDate,
    LocalDateTime endDate
){
}
