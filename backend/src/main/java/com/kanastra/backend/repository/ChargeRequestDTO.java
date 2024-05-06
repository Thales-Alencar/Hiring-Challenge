package com.kanastra.backend.repository;

public record ChargeRequestDTO(String name, String governmentId, String email, Double debtAmount, String debtDueDate) {
}
