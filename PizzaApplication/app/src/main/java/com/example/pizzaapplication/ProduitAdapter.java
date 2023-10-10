package com.example.pizzaapplication;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pizzaapplication.Entities.Produit;

import java.util.List;

public class ProduitAdapter extends BaseAdapter {

    Context ctx;
    private List<Produit> produits;
    private LayoutInflater inflater;



    public ProduitAdapter(Activity activity, List<Produit> produits) {
        this.produits = produits;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return produits.size();
    }

    @Override
    public Object getItem(int i) {
        return produits.get(i);
    }

    @Override
    public long getItemId(int i) {
        return produits.get(i).getId();
    }

    @Override

  public View getView(int i, View view, ViewGroup viewGroup) {
            if(view == null)
                view = inflater.inflate(R.layout.activity_list_item, null);
            TextView title = view.findViewById(R.id.titleProduit);
            TextView idP = view.findViewById(R.id.idP);
            ImageView image = view.findViewById(R.id.imageView);
            idP.setText(produits.get(i).getId()+" ");
            title.setText(produits.get(i).getNom());
            image.setImageResource(produits.get(i).getPhoto());

            return view;
        }
    }
