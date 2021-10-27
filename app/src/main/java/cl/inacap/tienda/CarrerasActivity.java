package cl.inacap.tienda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import cl.inacap.tienda.modelo.Tienda;

public class CarrerasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carreras);

        int productNro=(Integer) getIntent().getExtras().get("productNro");
        Tienda tienda=Tienda.tiendadejuegos[productNro];

        ImageView foto=(ImageView) findViewById(R.id.foto);
        foto.setImageResource(tienda.getIdFoto());
        foto.setContentDescription(tienda.getNombre());

        TextView nombre=(TextView) findViewById(R.id.nombre);
        nombre.setText(tienda.getNombre());

        TextView descripcion=(TextView) findViewById(R.id.descripcion);
        descripcion.setText(tienda.getDescripcion());

    }
}