package cl.inacap.tienda;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import cl.inacap.tienda.modelo.Tienda;

public class CategoriasActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

            ListView listajuegos=getListView();

            ArrayAdapter<Tienda> listaAdapter= new ArrayAdapter<>(this,
                    android.R.layout.simple_list_item_1, Tienda.tiendadejuegos);

            listajuegos.setAdapter(listaAdapter);
    }

    @Override
    public void onListItemClick(ListView listView, View view, int posicion, long id)
    {
         Intent intent=new Intent("CategoriasActivity.this, CarrerasActivity.class");
         intent.putExtra("productNro",(int)id);
         startActivity(intent);
        }

}