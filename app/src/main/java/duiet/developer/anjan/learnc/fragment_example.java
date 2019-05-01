package duiet.developer.anjan.learnc;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by HP on 30-08-2017.
 */

public class fragment_example extends Fragment {
    private static final String TAG="EXAMPLE";
    private ListView listView;
    private ArrayList<modelExample> examples;
    private  CustomAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.example,container,false);
        listView=(ListView)view.findViewById(R.id.examplelist);

        examples=new ArrayList<>();

        modelExample source=new modelExample();
        source.setHeading("Hello Word Program");
        source.setText(getResources().getString(R.string.hello_program));

        examples.add(source);

        source=new modelExample();
        source.setHeading("PROGRAM TO FIND LENGTH OF A STRING");
        source.setText(getResources().getString(R.string.length_program));

        examples.add(source);

        source=new modelExample();
        source.setHeading("PROGRAM TO CHECK A NUMBER IS PRIME OR NOT");
        source.setText(getResources().getString(R.string.prime_program));
        examples.add(source);

        source=new modelExample();
        source.setHeading("PROGRAM TO CHECK A NUMBER IS EVEN OR ODD");
        source.setText(getResources().getString(R.string.odd_program));
        examples.add(source);

        source=new modelExample();
        source.setHeading("PROGRAM TO SWAP TWO NUMBERS");
        source.setText(getResources().getString(R.string.swap_program));
        examples.add(source);

        source=new modelExample();
        source.setHeading("PROGRAM TO PRINT FIBONACCI SERIES");
        source.setText(getResources().getString(R.string.series_program));
        examples.add(source);

        source=new modelExample();
        source.setHeading("PROGRAM TO CONVERT BIMARY TO DECIMAL");
        source.setText(getResources().getString(R.string.binary_program));
        examples.add(source);

        source=new modelExample();
        source.setHeading("PROGRAM TO DEMONSTRATE CLASS AND OBJECTS");
        source.setText(getResources().getString(R.string.class_program));
        examples.add(source);

        source=new modelExample();
        source.setHeading("PROGRAM TO DEMONSTRATE DYNAMIC MEMORY ALLOCATION FOR OBJECTS");
        source.setText(getResources().getString(R.string.dynamic_progran));
        examples.add(source);



        adapter=new CustomAdapter(examples,getActivity());
        listView.setAdapter(adapter);



        return view;
    }
}
