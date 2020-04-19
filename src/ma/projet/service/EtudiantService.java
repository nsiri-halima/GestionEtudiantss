/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.service;
import java.util.ArrayList;
import java.util.List;
import ma.projet.classes.Etudiant;
import ma.projet.dao.IDao;

/**
 *
 * @author admin
 */
public class EtudiantService implements IDao<Etudiant>
 {
    private List<Etudiant> etudiants;

    public EtudiantService() {
        etudiants = new ArrayList<>();
    }

    @Override
    public boolean create(Etudiant o) {
        return etudiants.add(o);
    }

    @Override
    public boolean delete(Etudiant o) {
        return etudiants.remove(o);
    }

    @Override
    public boolean update(Etudiant o) {
        for (int i = 0; i < etudiants.size(); i++) {
            if (etudiants.get(i).getId() == o.getId()) {
                etudiants.set(i, o);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Etudiant> findAll() {
        return etudiants;
    }

    @Override
    public Etudiant findById(int id) {
        for (Etudiant e : etudiants) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;

    }


}
