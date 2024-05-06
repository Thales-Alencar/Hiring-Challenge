package com.kanastra.backend.repository.entity;

import com.kanastra.backend.repository.ChargeRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table (name = "charges")
@Entity (name = "charges")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Charge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String governmentId;
    private String email;
    private Double debtAmount;
    private String debtDueDate;

    public Charge(ChargeRequestDTO charge) {
        this.name = charge.name();
        this.governmentId = charge.governmentId();
        this.email = charge.email();
        this.debtAmount = charge.debtAmount();
        this.debtDueDate = charge.debtDueDate();
    }
}
