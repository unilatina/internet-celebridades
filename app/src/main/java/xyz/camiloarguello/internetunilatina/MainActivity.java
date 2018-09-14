package xyz.camiloarguello.internetunilatina;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends ListActivity {

    // Declaro variables
    DownloadTask tarea;
    String resultado;
    ArrayList<String> nombreCelebridad;
    ListView lista;
    public MyAdapter adaptador;
    public MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombreCelebridad = new ArrayList<>();
        nombreCelebridad.add("Juli");

        adaptador = new MyAdapter(this,nombreCelebridad);
        setListAdapter(adaptador);

        /*


        // Inicializo
        //tarea = new DownloadTask();
        nombreCelebridad = new ArrayList<>();
        lista = findViewById(R.id.list);


        try {

            // Llamar URL
            resultado = tarea.execute("http://www.posh24.se/kandisar").get();

            // Dividir codigo
            String[] codigoDividido = resultado.split("<div class=\"sidebarContainer\">");

            //Buscar URL
            // BUSQUE <img src="TODOLOQUEENCUENTREEN"
            Pattern p = Pattern.compile("<img src=\"(.*?)\"");
            // Encuentre los que son iguales
            Matcher m = p.matcher(codigoDividido[0]);

            while(m.find()) {
                System.out.println(m.group(1));
            }

            //Buscar Nombre
            Pattern p1 = Pattern.compile("alt=\"(.*?)\"");
            Matcher m1 = p1.matcher(codigoDividido[0]);

            while (m1.find()){
                nombreCelebridad.add(m1.group(1));
                adaptador = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, nombreCelebridad);
                lista.setAdapter(adaptador);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }



        String codigoHTML = "<div class=\"panel-pane pane-views-row newtop100--section1 newtop100--section\">\n" +
                "\t<div class=\"container_with_line\">\n" +
                "\t\t<article>\n" +
                "\t\t\t<div class=\"views-field views-field-field-media\"> \n" +
                "\t\t\t\t<div class=\"field-content\">\n" +
                "\t\t\t\t\t<a href=\"/top-100-djs/poll-2015-dimitri-vegas-mike\">\n" +
                "\t\t\t\t\t\t<div class=\"media\" id=\"file-7910\">\n" +
                "\t\t\t\t\t\t\t<figure class=\"media--image\">\n" +
                "\t\t\t\t\t\t\t\t<a href=\"/top-100-djs/poll-2015-dimitri-vegas-mike\">\n" +
                "\t\t\t\t\t\t\t\t\t<img src=\"https://djmag.com/sites/default/files/styles/djmag_landscape/public/top100/djs/image/DVLM.png?itok=W2rCuV_y\" alt=\"Dimitri Vegas &amp; Like Mike\" title=\"Dimitri Vegas &amp; Like Mike\" />\n" +
                "\t\t\t\t\t\t\t\t</a>\n" +
                "\t\t\t\t\t\t\t\t<figcaption class=\"media--image--caption\">Dimitri Vegas & Like Mike </figcaption>\n" +
                "\t\t\t\t\t\t\t</figure>\n" +
                "\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t</a>\n" +
                "\t\t\t\t</div>\n" +
                "\t\t\t</div>\n" +
                "\t\t\t<div class=\"views-field views-field-field-top100-position\"> \n" +
                "\t\t\t\t<div class=\"field-content\">1</div>\n" +
                "\t\t\t</div>\n" +
                "\t\t\t<div class=\"views-field views-field-field-top100-places\"> \n" +
                "\t\t\t\t<div class=\"field-content\">\n" +
                "\t\t\t\t\t<div class=\"top100dj-title-bar\">\n" +
                "\t\t\t\t\t\t<div class=\"top100dj-position\">1</div>\n" +
                "\t\t\t\t\t\t<div class=\"top100dj-name\">\n" +
                "\t\t\t\t\t\t\t<a href=\"/top-100-djs/poll-2015-dimitri-vegas-mike\">Dimitri Vegas &amp; Like Mike</a>\n" +
                "\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t<div class=\"top100dj-movement\">Up 1</div>\n" +
                "\t\t\t\t\t</div>\n" +
                "\t\t\t\t</div>\n" +
                "\t\t\t</div>\n" +
                "\t\t</article>\n" +
                "\t</div>\n" +
                "</div>\n" +
                "\n";


        // Buscar URL
        Pattern p = Pattern.compile("<img src=\"(.*?)\"");
        Matcher m = p.matcher(codigoHTML);

        while(m.find()) {
            System.out.println(m.group(1));
        }

        //Buscar Nombre
        Pattern p1 = Pattern.compile("title=\"(.*?)\"");
        Matcher m1 = p1.matcher(codigoHTML);


        //TextView hola = findViewById(R.id.hello);

        while (m1.find()){

            //hola.setText(m1.group(1));
            nombreCelebridad.add(m1.group(1));
            //adaptador = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, nombreCelebridad);
            setListAdapter(new MyAdapter(this,nombreCelebridad));
            //lista.setAdapter(adaptador);

        }
        */

    }

}
