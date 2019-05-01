package duiet.developer.anjan.learnc;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;

/**
 * Created by HP on 30-08-2017.
 */

public class fragment_test extends Fragment {
    private static final String TAG="TEST";
    private ImageButton testbtn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.test,container,false);
        testbtn=(ImageButton) view.findViewById(R.id.testbutton);

        testbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getActivity(),testActivity.class);
                startActivity(i);
            }
        });



            return view;
        }

}
