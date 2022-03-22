package com.example.Ecommerce.model;

import java.time.LocalDate;
import javax.persistence.*;

import com.example.Ecommerce.enumaration.Flag;

import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String number;
    
    private String cvv;

    private LocalDate expirationDate;

    private Flag flag;
}
