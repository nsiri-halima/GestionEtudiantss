/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.classes;

/**
 *
 * @author admin
 */
public class Etudiant {
    private int id;
    private String nom;
    private String prenom;
    private String sexe;
    private String section;
    private static int comp;

    public Etudiant(int id, String nom, String prenom, String sexe, String section) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.section = section;
    }

    public Etudiant(String nom, String prenom, String sexe, String section) {
        this.id = ++comp;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.section = section;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

}

