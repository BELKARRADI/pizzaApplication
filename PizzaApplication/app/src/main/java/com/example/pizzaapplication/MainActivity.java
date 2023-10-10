package com.example.pizzaapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.pizzaapplication.Entities.Produit;
import com.example.pizzaapplication.Services.ProduitService;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView liste;
    private ProduitAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ProduitService ps = new ProduitService();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        liste = findViewById(R.id.list);


        ps.create(new Produit("Pizza Margherita", 6, R.drawable.pizza1, 12, "Farine, Tomates, Mozzarella, Basilic, Huile d'olive, Sel", "Une délicieuse pizza Margherita classique avec une croûte fine et des ingrédients frais.", "1. Préchauffez votre four à 220°C.\n2. Étalez la pâte à pizza sur une plaque de cuisson.\n3. Étalez une fine couche de sauce tomate sur la pâte.\n4. Ajoutez des tranches de mozzarella sur la sauce tomate.\n5. Saupoudrez de feuilles de basilic frais et ajoutez un filet d'huile d'olive.\n6. Assaisonnez avec une pincée de sel.\n7. Faites cuire au four pendant 12 minutes ou jusqu'à ce que la croûte soit dorée.\n8. Servez chaud et dégustez !"));
        ps.create(new Produit("Pizza Pepperoni", 8, R.drawable.pizza2, 15, "Pâte à pizza, Sauce tomate, Fromage mozzarella, Pepperoni, Origan, Poivrons rouges, Champignons, Olives noires, Oignons", "La Pizza Pepperoni est une pizza classique garnie de délicieux pepperoni tranché, de mozzarella fondante et d'un mélange d'ingrédients savoureux. Parfaite pour les amateurs de viande et de fromage !", "1. Préchauffez votre four à 220°C.\n2. Étalez la pâte à pizza sur une plaque de cuisson.\n3. Étalez une généreuse couche de sauce tomate sur la pâte.\n4. Ajoutez une abondance de fromage mozzarella râpé.\n5. Disposez les tranches de pepperoni sur le fromage.\n6. Ajoutez des poivrons rouges, des champignons, des olives noires et des oignons coupés en dés.\n7. Saupoudrez d'origan séché.\n8. Faites cuire au four pendant environ 15 minutes jusqu'à ce que le fromage soit doré et que la croûte soit croustillante.\n9. Dégustez cette pizza au pepperoni chaude et savoureuse !"));
        ps.create(new Produit("Pizza Végétarienne", 7, R.drawable.pizza3, 18, "Pâte à pizza, Sauce tomate, Fromage mozzarella, Poivrons, Champignons, Oignons rouges, Olives noires, Épinards, Tomates cerises, Basilic frais", "La Pizza Végétarienne est une option saine et délicieuse. Elle est garnie de légumes frais, de fromage mozzarella fondant et de basilic parfumé. Parfait pour les amateurs de légumes !", "1. Préchauffez votre four à 220°C.\n2. Étalez la pâte à pizza sur une plaque de cuisson.\n3. Étalez une couche de sauce tomate sur la pâte.\n4. Ajoutez une quantité généreuse de fromage mozzarella râpé.\n5. Disposez des poivrons, des champignons, des oignons rouges, des olives noires et des épinards sur la pizza.\n6. Garnissez de quartiers de tomates cerises.\n7. Faites cuire au four pendant environ 18 minutes ou jusqu'à ce que le fromage soit bien fondu et que les légumes soient tendres.\n8. Juste avant de servir, ajoutez des feuilles de basilic frais.\n9. Savourez cette pizza végétarienne colorée et saine !"));
        ps.create(new Produit("Pizza Quatre Saisons", 9, R.drawable.pizza4, 20, "Pâte à pizza, Sauce tomate, Fromage mozzarella, Jambon, Champignons, Artichauts, Olives noires, Basilic, Origan", "La Pizza Quatre Saisons est une délicieuse combinaison de saveurs. Elle est garnie de jambon, de champignons, d'artichauts et d'olives noires, avec une touche d'herbes aromatiques. Un voyage culinaire en une seule bouchée !", "1. Préchauffez votre four à 220°C.\n2. Étalez la pâte à pizza sur une plaque de cuisson.\n3. Étalez une généreuse couche de sauce tomate sur la pâte.\n4. Ajoutez une abondance de fromage mozzarella râpé.\n5. Répartissez le jambon, les champignons tranchés, les cœurs d'artichauts et les olives noires sur la pizza.\n6. Saupoudrez d'origan séché et de basilic frais.\n7. Faites cuire au four pendant environ 20 minutes jusqu'à ce que le fromage soit bien fondu et que la croûte soit dorée.\n8. Dégustez cette pizza Quatre Saisons pleine de saveurs !"));
        ps.create(new Produit("Pizza Hawaïenne", 8, R.drawable.pizza5, 16, "Pâte à pizza, Sauce tomate, Fromage mozzarella, Jambon, Ananas, Basilic frais", "La Pizza Hawaïenne est une combinaison sucrée et salée qui plaira à vos papilles. Elle est garnie de jambon, d'ananas et de basilic frais, créant une explosion de saveurs exotiques.", "1. Préchauffez votre four à 220°C.\n2. Étalez la pâte à pizza sur une plaque de cuisson.\n3. Étalez une fine couche de sauce tomate sur la pâte.\n4. Ajoutez une généreuse quantité de fromage mozzarella râpé.\n5. Répartissez des tranches de jambon et des morceaux d'ananas sur la pizza.\n6. Garnissez de feuilles de basilic frais.\n7. Faites cuire au four pendant environ 16 minutes ou jusqu'à ce que le fromage soit fondu et la croûte soit dorée.\n8. Savourez cette pizza Hawaïenne exotique !"));
        ps.create(new Produit("Pizza Quattro Formaggi", 10, R.drawable.pizza6, 22, "Pâte à pizza, Sauce blanche, Gorgonzola, Mozzarella, Parmesan, Fromage de chèvre, Origan", "La Pizza Quattro Formaggi est une délicieuse pizza au fromage pour les amateurs de fromage. Elle est garnie de gorgonzola, mozzarella, parmesan et fromage de chèvre, avec une touche d'origan.", "1. Préchauffez votre four à 220°C.\n2. Étalez la pâte à pizza sur une plaque de cuisson.\n3. Étalez une délicieuse sauce blanche sur la pâte.\n4. Ajoutez une variété de fromages : gorgonzola, mozzarella, parmesan et fromage de chèvre.\n5. Saupoudrez d'origan séché.\n6. Faites cuire au four pendant environ 22 minutes jusqu'à ce que le fromage soit fondu et la croûte soit croustillante.\n7. Dégustez cette pizza Quattro Formaggi riche en saveurs fromagères !"));
        ps.create(new Produit("Pizza Calzone", 8, R.drawable.pizza7, 20, "Pâte à pizza, Sauce tomate, Fromage mozzarella, Jambon, Champignons, Ricotta, Origan", "La Pizza Calzone est une pizza repliée en forme de chausson, avec une garniture délicieuse. Elle est farcie de jambon, de champignons, de ricotta et de mozzarella, et assaisonnée d'origan.", "1. Préchauffez votre four à 220°C.\n2. Étalez la pâte à pizza sur une plaque de cuisson.\n3. Étalez une fine couche de sauce tomate sur une moitié de la pâte.\n4. Ajoutez le jambon, les champignons, la ricotta et la mozzarella sur la moitié de la pâte avec la sauce tomate.\n5. Saupoudrez d'origan séché.\n6. Pliez l'autre moitié de la pâte sur la garniture et scellez les bords.\n7. Faites cuire au four pendant environ 20 minutes jusqu'à ce que la croûte soit dorée.\n8. Dégustez cette pizza Calzone chaude et délicieuse !"));

        ps.create(new Produit("Pizza Margherita", 6, R.drawable.pizza1, 12, "Farine, Tomates, Mozzarella, Basilic, Huile d'olive, Sel", "Une délicieuse pizza Margherita classique avec une croûte fine et des ingrédients frais.", "1. Préchauffez votre four à 220°C.\n2. Étalez la pâte à pizza sur une plaque de cuisson.\n3. Étalez une fine couche de sauce tomate sur la pâte.\n4. Ajoutez des tranches de mozzarella sur la sauce tomate.\n5. Saupoudrez de feuilles de basilic frais et ajoutez un filet d'huile d'olive.\n6. Assaisonnez avec une pincée de sel.\n7. Faites cuire au four pendant 12 minutes ou jusqu'à ce que la croûte soit dorée.\n8. Servez chaud et dégustez !"));
        ps.create(new Produit("Pizza Pepperoni", 8, R.drawable.pizza2, 15, "Pâte à pizza, Sauce tomate, Fromage mozzarella, Pepperoni, Origan, Poivrons rouges, Champignons, Olives noires, Oignons", "La Pizza Pepperoni est une pizza classique garnie de délicieux pepperoni tranché, de mozzarella fondante et d'un mélange d'ingrédients savoureux. Parfaite pour les amateurs de viande et de fromage !", "1. Préchauffez votre four à 220°C.\n2. Étalez la pâte à pizza sur une plaque de cuisson.\n3. Étalez une généreuse couche de sauce tomate sur la pâte.\n4. Ajoutez une abondance de fromage mozzarella râpé.\n5. Disposez les tranches de pepperoni sur le fromage.\n6. Ajoutez des poivrons rouges, des champignons, des olives noires et des oignons coupés en dés.\n7. Saupoudrez d'origan séché.\n8. Faites cuire au four pendant environ 15 minutes jusqu'à ce que le fromage soit doré et que la croûte soit croustillante.\n9. Dégustez cette pizza au pepperoni chaude et savoureuse !"));
        ps.create(new Produit("Pizza Végétarienne", 7, R.drawable.pizza3, 18, "Pâte à pizza, Sauce tomate, Fromage mozzarella, Poivrons, Champignons, Oignons rouges, Olives noires, Épinards, Tomates cerises, Basilic frais", "La Pizza Végétarienne est une option saine et délicieuse. Elle est garnie de légumes frais, de fromage mozzarella fondant et de basilic parfumé. Parfait pour les amateurs de légumes !", "1. Préchauffez votre four à 220°C.\n2. Étalez la pâte à pizza sur une plaque de cuisson.\n3. Étalez une couche de sauce tomate sur la pâte.\n4. Ajoutez une quantité généreuse de fromage mozzarella râpé.\n5. Disposez des poivrons, des champignons, des oignons rouges, des olives noires et des épinards sur la pizza.\n6. Garnissez de quartiers de tomates cerises.\n7. Faites cuire au four pendant environ 18 minutes ou jusqu'à ce que le fromage soit bien fondu et que les légumes soient tendres.\n8. Juste avant de servir, ajoutez des feuilles de basilic frais.\n9. Savourez cette pizza végétarienne colorée et saine !"));
        ps.create(new Produit("Pizza Quatre Saisons", 9, R.drawable.pizza4, 20, "Pâte à pizza, Sauce tomate, Fromage mozzarella, Jambon, Champignons, Artichauts, Olives noires, Basilic, Origan", "La Pizza Quatre Saisons est une délicieuse combinaison de saveurs. Elle est garnie de jambon, de champignons, d'artichauts et d'olives noires, avec une touche d'herbes aromatiques. Un voyage culinaire en une seule bouchée !", "1. Préchauffez votre four à 220°C.\n2. Étalez la pâte à pizza sur une plaque de cuisson.\n3. Étalez une généreuse couche de sauce tomate sur la pâte.\n4. Ajoutez une abondance de fromage mozzarella râpé.\n5. Répartissez le jambon, les champignons tranchés, les cœurs d'artichauts et les olives noires sur la pizza.\n6. Saupoudrez d'origan séché et de basilic frais.\n7. Faites cuire au four pendant environ 20 minutes jusqu'à ce que le fromage soit bien fondu et que la croûte soit dorée.\n8. Dégustez cette pizza Quatre Saisons pleine de saveurs !"));
        ps.create(new Produit("Pizza Hawaïenne", 8, R.drawable.pizza5, 16, "Pâte à pizza, Sauce tomate, Fromage mozzarella, Jambon, Ananas, Basilic frais", "La Pizza Hawaïenne est une combinaison sucrée et salée qui plaira à vos papilles. Elle est garnie de jambon, d'ananas et de basilic frais, créant une explosion de saveurs exotiques.", "1. Préchauffez votre four à 220°C.\n2. Étalez la pâte à pizza sur une plaque de cuisson.\n3. Étalez une fine couche de sauce tomate sur la pâte.\n4. Ajoutez une généreuse quantité de fromage mozzarella râpé.\n5. Répartissez des tranches de jambon et des morceaux d'ananas sur la pizza.\n6. Garnissez de feuilles de basilic frais.\n7. Faites cuire au four pendant environ 16 minutes ou jusqu'à ce que le fromage soit fondu et la croûte soit dorée.\n8. Savourez cette pizza Hawaïenne exotique !"));
        ps.create(new Produit("Pizza Quattro Formaggi", 10, R.drawable.pizza6, 22, "Pâte à pizza, Sauce blanche, Gorgonzola, Mozzarella, Parmesan, Fromage de chèvre, Origan", "La Pizza Quattro Formaggi est une délicieuse pizza au fromage pour les amateurs de fromage. Elle est garnie de gorgonzola, mozzarella, parmesan et fromage de chèvre, avec une touche d'origan.", "1. Préchauffez votre four à 220°C.\n2. Étalez la pâte à pizza sur une plaque de cuisson.\n3. Étalez une délicieuse sauce blanche sur la pâte.\n4. Ajoutez une variété de fromages : gorgonzola, mozzarella, parmesan et fromage de chèvre.\n5. Saupoudrez d'origan séché.\n6. Faites cuire au four pendant environ 22 minutes jusqu'à ce que le fromage soit fondu et la croûte soit croustillante.\n7. Dégustez cette pizza Quattro Formaggi riche en saveurs fromagères !"));
        ps.create(new Produit("Pizza Calzone", 8, R.drawable.pizza7, 20, "Pâte à pizza, Sauce tomate, Fromage mozzarella, Jambon, Champignons, Ricotta, Origan", "La Pizza Calzone est une pizza repliée en forme de chausson, avec une garniture délicieuse. Elle est farcie de jambon, de champignons, de ricotta et de mozzarella, et assaisonnée d'origan.", "1. Préchauffez votre four à 220°C.\n2. Étalez la pâte à pizza sur une plaque de cuisson.\n3. Étalez une fine couche de sauce tomate sur une moitié de la pâte.\n4. Ajoutez le jambon, les champignons, la ricotta et la mozzarella sur la moitié de la pâte avec la sauce tomate.\n5. Saupoudrez d'origan séché.\n6. Pliez l'autre moitié de la pâte sur la garniture et scellez les bords.\n7. Faites cuire au four pendant environ 20 minutes jusqu'à ce que la croûte soit dorée.\n8. Dégustez cette pizza Calzone chaude et délicieuse !"));



        List<Produit> produits = ps.findAll();

        adapter = new ProduitAdapter(MainActivity.this, produits);

        liste.setAdapter(adapter);
        liste.setClickable(true);

        liste.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Produit produitSelectionne = produits.get(position);

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Choisissez une action");
                builder.setMessage("Que voulez-vous faire avec : " + produitSelectionne.getNom());

                // Bouton pour supprimer l'élément
                builder.setPositiveButton("Supprimer", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Mettez le code pour supprimer l'élément ici
                        produits.remove(position);
                        // Mettez à jour votre adapter ou la liste de produits
                        adapter.notifyDataSetChanged(); // Mettez à jour l'adapter
                    }
                });

                // Bouton pour voir les détails de l'élément
                builder.setNegativeButton("Voir les détails", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent send = new Intent(MainActivity.this, detailsProduit.class);
                        send.putExtra("nom", produitSelectionne.getNom());
                        send.putExtra("description", produitSelectionne.getDescription());
                        send.putExtra("photo", produitSelectionne.getPhoto());
                        send.putExtra("duree", produitSelectionne.getDuree());
                        send.putExtra("nbrIngredients", produitSelectionne.getNbrIngredients());
                        send.putExtra("preparation", produitSelectionne.getPreparation());
                        send.putExtra("detailsIngred", produitSelectionne.getDetaisIngred());
                        startActivity(send);
                    }
                });

                builder.create().show();
            }
        });
    }
}
