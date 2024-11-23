package com.pruebagml.demo.entities;

import java.time.LocalDate;

import org.hibernate.annotations.SecondaryRow;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(unique = true)
    private String sharedKey;

    private String businessId;

    private String email;

    private Long phone;

    private LocalDate startDate;
    
    private LocalDate endDate;

    private LocalDate dataAdded;
    
}
