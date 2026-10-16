package com.example.aplicacionesmovilesdesarrollo;

import android.os.Bundle;
import java.util.Arrays;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclepersonajes;
    List<Personaje> ListaPersonajes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_main);

            recyclepersonajes = findViewById(R.id.recyclepersonajes);

            Personaje Personaje1 = new Personaje("https://static.wikia.nocookie.net/jetsetradio/images/d/da/Beat_transparent.png/revision/latest?cb=20220327125746","Beat"," parte de The GG's, " +
                    "Es el protagonista y fundador de los GG's. Es un patinador rebelde apasionado por los grafitis, la música y la libertad en las calles.");



            Personaje Personaje2 = new Personaje("https://static.wikia.nocookie.net/jetsetradio/images/7/7e/Gum_JGR_Artwork.png/revision/latest/scale-to-width-down/159?cb=20260516165734","Gum",
                    " parte de The GG's, Es una integrante original de los GG's. Tiene una personalidad atrevida y sarcástica, y destaca por su habilidad para pintar grafitis mientras patina.");



            Personaje Personaje3 = new Personaje("https://static.wikia.nocookie.net/jetsetradio/images/7/7f/Tab_transparent.png/revision/latest/scale-to-width-down/250?cb=20210928101556","Corn",
                    " parte de The GG's, Es uno de los miembros originales de los GG's. Es un joven enérgico que disfruta patinar, competir contra otras bandas y defender su territorio.");



            Personaje Personaje4 = new Personaje("https://static.wikia.nocookie.net/jetsetradio/images/9/9a/Garam.png/revision/latest/scale-to-width-down/250?cb=20230623204155","Garam",
                    " parte de The GG's, Es un patinador atlético que destaca por su fuerza y apariencia particular, con gafas de estilo futurista. Puede unirse a los GG's durante la aventura.");



            Personaje Personaje5 = new Personaje("https://static.wikia.nocookie.net/jetsetradio/images/a/aa/Loveshockers.png/revision/latest?cb=20231231141645","Love Shockers",
                    " Pandilla rival, Son una banda rival formada por chicas con estética punk. Buscan conquistar el territorio de los GG's y se enfrentan a ellos por el control de las calles.");



            Personaje Personaje6 = new Personaje("https://static.wikia.nocookie.net/jetsetradio/images/0/01/Sniper_jsr.png/revision/latest/scale-to-width-down/223?cb=20230623212223","The golder Rhinos",
                    " Pandilla rival, Son un grupo de mercenarios que trabajan para la corporación Rokkaku. Utilizan armamento y fuerza para perseguir a los patinadores y ayudar a imponer el control sobre la ciudad.");

            ListaPersonajes.addAll(Arrays.asList(
            Personaje1,
                    Personaje2,
                    Personaje3,
                    Personaje4,
                    Personaje5,
                    Personaje6
                    ));

        recyclepersonajes.setLayoutManager(new LinearLayoutManager(this));

        recyclepersonajes.setAdapter(new AdaptadorPersonaje(ListaPersonajes));
        }
    }

