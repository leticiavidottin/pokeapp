package com.pokeapp.pokebaralho_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "pokedex")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pokedex {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "national_number", nullable = false)
    private Long nationalNumber;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "form_name", nullable = false, length = 50)
    private String formName;

    @Column(name = "gen", nullable = false, length = 4)
    private String gen;

    @Column(name = "primary_type", nullable = false, length = 20)
    private String primaryType;

    @Column(name = "secondary_type", length = 20)
    private String secondaryType;

    @Column(name = "evochain_0", nullable = false, length = 50)
    private String evochain0;

    @Column(name = "evochain_1", length = 50)
    private String evochain1;

    @Column(name = "evochain_2", length = 50)
    private String evochain2;

    @Column(name = "evochain_3", length = 50)
    private String evochain3;

    @Column(name = "is_regional", nullable = false)
    private Boolean isRegional;

    @Column(name = "is_first_partner", nullable = false)
    private Boolean isFirstPartner;

    @Column(name = "is_baby", nullable = false)
    private Boolean isBaby;

    @Column(name = "is_fossil", nullable = false)
    private Boolean isFossil;

    @Column(name = "is_sublegendary", nullable = false)
    private Boolean isSublegendary;

    @Column(name = "is_legendary", nullable = false)
    private Boolean isLegendary;

    @Column(name = "is_mythical", nullable = false)
    private Boolean isMythical;

    @Column(name = "is_pseudo_legendary")
    private Boolean isPseudoLegendary;

    @Column(name = "is_ultra_beast", nullable = false)
    private Boolean isUltraBeast;

    @Column(name = "is_eeveelution", nullable = false)
    private Boolean isEeveelution;

    @Column(name = "image_url", length = 255)
    private String imageUrl;
}