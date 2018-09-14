package xyz.camiloarguello.internetunilatina;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Vector;

public class MyAdapter extends BaseAdapter {

    private final Activity activity;
    //private final Vector<String> list;
    private final ArrayList<String> list;

    public MyAdapter(Activity activity, ArrayList<String> list){
        super();
        this.activity = activity;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View v = inflater.inflate(R.layout.list,null,true);
        TextView textView = view.findViewById(R.id.text);
        textView.setText(list.get(i));
        ImageView imageView = view.findViewById(R.id.image);
        imageView.setImageResource(R.drawable.victoria);
        return v;
    }
}
