package notas.iso.com.glide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.imageView);

        String urlIMG = "https://instagram.fmad3-3.fna.fbcdn.net/vp/c3f12529a5630b5d339debacb703c562/5C348E8C/t51.2885-15/e35/25006764_560495714288222_3807930477218627584_n.jpg";

        //TODO DRAWABLE SIN GLIDE
        //TODO va a dar error por el tamaño y resolucion de la img
        //imageView.setImageDrawable(getResources().getDrawable(R.drawable.TU_IMAGEN,null));

        //TODO cargar img desde drawable
        //Glide.with(getBaseContext()).load(R.drawable.TU_IMAGEN).into(imageView);

        //TODO cargar img desde internet
        //Glide.with(getBaseContext()).load(urlIMG).into(imageView);

        //TODO cargar img drawable o desde internet con placeholder y mostramos icono si hay algun error
        //TODO ROMPEMOS EL LINK PARA COMPROBAR SI FUNCIONA .error
        //Glide.with(getBaseContext()).load(urlIMG).apply(new RequestOptions().placeholder(R.drawable.ic_descargando).error(R.drawable.ic_error)).into(imageView);

        //TODO redimensionar y recortar img
        /**
         Glide.with(getBaseContext()).load(urlIMG)
         .apply(new RequestOptions().placeholder(R.drawable.ic_descargando).error(R.drawable.ic_error).override(200,200).centerCrop())
         .into(imageView);
         */

        //TODO CARGAR GIF
        Glide.with(getBaseContext()).load(R.drawable.imggif)
                //.apply(new RequestOptions().placeholder(R.drawable.ic_descargando).error(R.drawable.ic_error).override(550,550).centerCrop())
                .into(imageView);


    }

}
