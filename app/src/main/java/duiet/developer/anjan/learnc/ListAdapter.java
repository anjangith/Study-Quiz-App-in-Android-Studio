package duiet.developer.anjan.learnc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by HP on 08-08-2018.
 */

public class ListAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<modelClass> list;

    public ListAdapter(Context ctx,ArrayList<modelClass> list){
        this.context=ctx;
        this.list=list;
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
        if(view==null) {
            view = LayoutInflater.from(context).inflate(R.layout.cardview, viewGroup, false);
        }
        ImageView imageView=(ImageView)view.findViewById(R.id.image);
        TextView head=(TextView)view.findViewById(R.id.headText);
        TextView desc=(TextView)view.findViewById(R.id.descriptionText);
        modelClass model=(modelClass) this.getItem(i);

        head.setText(model.getName());
        desc.setText(model.getDescription());
        int res=model.getResource();
        if(res==0){
            imageView.setImageResource(0);
        }else{
            imageView.setImageResource(model.getResource());
        }
        return view;
    }
}
