package com.example.magazinsportiv.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "produse")
public class Produs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nume;

    @Column(nullable = false)
    private Double pret;

    private String descriere;

    private Integer cantitateInStoc;

    private String imagine;

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;

    // Getters și Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Double getPret() {
        return pret;
    }

    public void setPret(Double pret) {
        this.pret = pret;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public Integer getCantitateInStoc() {
        return cantitateInStoc;
    }

    public void setCantitateInStoc(Integer cantitateInStoc) {
        this.cantitateInStoc = cantitateInStoc;
    }

    public String getImagine() {
        return imagine;
    }

    public void setImagine(String imagine) {
        this.imagine = imagine;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
}

