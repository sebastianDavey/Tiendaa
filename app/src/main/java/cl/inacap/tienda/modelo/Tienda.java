package cl.inacap.tienda.modelo;

import cl.inacap.tienda.R;

public class Tienda {
    private String nombre;
    private String descripcion;
    private int idFoto;

    public static final Tienda[] tiendadejuegos={
       new Tienda("Call of duty","Guerra,Shooter", R.drawable.cod),
            new Tienda("Need For Speed", "autos", R.drawable.nfs),
            new Tienda("Resident Evil", "Shooter, Zombies, Terror", R.drawable.re3),
            new Tienda("Doom Eternal","Shooter, Fps, Zombies,", R.drawable.doom),
            new Tienda("Counter Strike","Fps, Shooter", R.drawable.counter)
    };

    public Tienda(String nombre, String descripcion, int idFoto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idFoto = idFoto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getIdFoto() {
        return idFoto;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
