package xyz.camiloarguello.internetunilatina;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    // TODO (21) Inicializar Arraylist para imágenes y texto
    // TODO (22) Añadirle el contenido a cada imagen y a cada texto
    // TODO (23) LLamar RecyclerView por ID
    // TODO (24) Llama clase RecyclerViewAdapter y pasarle los parámetros de Contexto, imagenes y texto
    // TODO (25) Ajustar el adaptador a recyclerview.setAdapter(adaptador creado)
    // TODO (26) Llamar un layout para renderizar todos los cardview. Usa recyclerview.setLayoutManager(new LinearLayout) -> Puedes usar otros layouts

    private ArrayList<String> mText = new ArrayList<>();
    private ArrayList<Integer> mImages = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mText.add("Colombia");
        mImages.add(R.drawable.victoria);

        mText.add("Francia");
        mImages.add(R.drawable.imagencampo);

        mText.add("Canada");
        mImages.add(R.drawable.victoria);

        mText.add("USA");
        mImages.add(R.drawable.imagencampo);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,mImages,mText);

        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    // TODO (3) Crear una clase RecyclerViewAdapter en el mismo package que MainActivity

}
