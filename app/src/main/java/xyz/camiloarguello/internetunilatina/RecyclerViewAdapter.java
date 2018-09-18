package xyz.camiloarguello.internetunilatina;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{
    // TODO (4) crear una clase dentro de RecyclerView que herede (extends) RecyclerView.ViewHolder
    // TODO (5) Añadirle le constructor a la clase (ALT + ENTER)
    // TODO (12) Inicializar los elementos CardView, ImageView, Textview como variables
    // TODO (13) Llamar los elementos CardView, ImageView, Textview por ID
    // TODO (14) Ajustar la clase RecyclerView Adapter para que herede de RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>
    // TODO (15) Implementar los métodos de la clase Padre
    // TODO (16) Añadir 2 ArrayList. 1 Para que almacene las imágenes y otro para TextView. Añadir una variable para el contexto
    // TODO (17) Click derecho y Generar un nuevo Constructor a partir de las variables creadas
    // TODO (18) En el método onCreateViewHolder inflar el layout "CardView". Usa LayoutInflater.from( Contexto de la clase ).inflate(Layout de CardView, padre, Añadir a la ruta principal)
    // TODO (19) Añadir un ViewHolder para adaptar los datos con la vista creada. Instancialo con new ViewHolder(vista inflada). No olvidar retornar el viewHolder creado

    private Context context;
    private ArrayList<Integer> mImages = new ArrayList<>();
    private ArrayList<String> mText = new ArrayList<>();

    public RecyclerViewAdapter(Context context, ArrayList<Integer> mImages, ArrayList<String> mText) {
        this.context = context;
        this.mImages = mImages;
        this.mText = mText;
    }

    private static final String TAG = "RecyclerViewAdapter";

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_lista, parent,false);
        ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        // TODO (20) añadir a las vistas el contenido enviado desde Main Activity usando holder.ELEMENTO.PROPIEDAD
        // Aquí tambien se puede añadir listeners para que ejecuten comandos al hacer click

        holder.imageView.setImageResource(mImages.get(position));
        holder.title.setText(mText.get(position));
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, mText.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mImages.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CardView cardView;
        ImageView imageView;
        TextView title;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.parent_layout);
            imageView = itemView.findViewById(R.id.image_card);
            title = itemView.findViewById(R.id.titulo);

        }
    }
}
