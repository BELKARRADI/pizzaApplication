package com.example.pizzaapplication.Services;

import com.example.pizzaapplication.Dao.IDao;
import com.example.pizzaapplication.Entities.Produit;

import java.util.ArrayList;
import java.util.List;

public class ProduitService implements IDao<Produit> {

    private List<Produit> produits;

    public ProduitService() {
        this.produits = new ArrayList<>();

    }




    @Override
    public boolean create(Produit o) {
        return produits.add(o);
    }

    @Override
    public boolean update(Produit o) {
        for(Produit p : produits){
            if(p.getId() == o.getId()) {
                p.setNom(o.getNom());
                p.setPhoto(o.getPhoto());
                p.setDuree(o.getDuree());
                p.setDescription(o.getDescription());
                p.setPreparation(o.getPreparation());
                p.setDetaisIngred(o.getDetaisIngred());
                p.setNbrIngredients(o.getNbrIngredients());
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Produit o) {
        return produits.remove(o);
    }

    @Override
    public Produit findById(int id) {

        for(Produit p : produits){
            if(p.getId() == id)
                return p;
        }
        return null;
    }

    @Override
    public List<Produit> findAll() {
        return produits;
    }
}
