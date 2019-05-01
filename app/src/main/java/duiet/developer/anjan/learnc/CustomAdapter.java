package duiet.developer.anjan.learnc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by HP on 12-03-2018.
 */

public class CustomAdapter extends BaseAdapter {
    private ArrayList<modelExample> examples;
    private Context context;

    public CustomAdapter(ArrayList<modelExample> examples,Context context){
        this.examples=examples;
        this.context=context;

    }

    @Override
    public int getCount() {
        return examples.size();

    }

    @Override
    public Object getItem(int i) {
        return examples.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view==null){
            view= LayoutInflater.from(context).inflate(R.layout.model,viewGroup,false);

        }
        modelExample example=(modelExample)this.getItem(i);
        TextView head=(TextView)view.findViewById(R.id.heading);
       TextView des=(TextView)view.findViewById(R.id.code);
        head.setText(example.getHeading());
       des.setText(example.getText());
        return view;

    }
}
