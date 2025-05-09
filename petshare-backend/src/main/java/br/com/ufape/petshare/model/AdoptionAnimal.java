package br.com.ufape.petshare.model;

import java.time.LocalDate;

import br.com.ufape.petshare.model.enums.AdoptionStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AdoptionAnimal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;

    @Enumerated(EnumType.STRING)
    private AdoptionStatus status;
    @ManyToOne
    @JoinColumn(name = "adopter_id")
    private User adopter;

    @ManyToOne
    @JoinColumn(name = "donate_animal_id")
    private DonateAnimal donateAnimal;
}