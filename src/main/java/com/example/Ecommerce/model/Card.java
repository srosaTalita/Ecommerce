package com.example.Ecommerce.model;

import java.time.LocalDate;
import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private int id;

    @Getter @Setter
    private String name;

    @Getter @Setter
    private String number;
    
    @Getter @Setter
    private String cvv;

    @Getter @Setter
    private LocalDate expirationDate;
}
