package duiet.developer.anjan.learnc;

import android.app.LauncherActivity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by HP on 24-09-2017.
 */

public class myAdapter extends RecyclerView.Adapter<myAdapter.ViewHolder> {
    private List<listItem> list;
    private Context context;

    public myAdapter(List<listItem> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        listItem listitm=list.get(position);

        holder.textHead.setText(listitm.getHead());
        holder.textDescp.setText(listitm.getDescp());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(position==0){
                    Intent i=new Intent(context,BundleActivity.class);
                    i.putExtra("position",position);
                    context.startActivity(i);
                }
                if(position==1){
                    Intent i=new Intent(context,BundleActivity.class);
                    i.putExtra("position",position);
                    context.startActivity(i);
                }
                if(position==2){
                    Intent i=new Intent(context,BundleActivity.class);
                    i.putExtra("position",position);
                    context.startActivity(i);
                }
                if(position==3){
                    Intent i=new Intent(context,BundleActivity.class);
                    i.putExtra("position",position);
                    context.startActivity(i);
                }
                if(position==4){
                    Intent i=new Intent(context,BundleActivity.class);
                    i.putExtra("position",position);
                    context.startActivity(i);
                }
                if(position==5){
                    Intent i=new Intent(context,BundleActivity.class);
                    i.putExtra("position",position);
                    context.startActivity(i);
                }
                if(position==6){
                    Intent i=new Intent(context,BundleActivity.class);
                    i.putExtra("position",position);
                    context.startActivity(i);
                }
                if(position==7){
                    Intent i=new Intent(context,BundleActivity.class);
                    i.putExtra("position",position);
                    context.startActivity(i);
                }
                if(position==8){
                    Intent i=new Intent(context,BundleActivity.class);
                    i.putExtra("position",position);
                    context.startActivity(i);
                }
                if(position==9){
                    Intent i=new Intent(context,BundleActivity.class);
                    i.putExtra("position",position);
                    context.startActivity(i);
                }
                if(position==10){
                    Intent i=new Intent(context,BundleActivity.class);
                    i.putExtra("position",position);
                    context.startActivity(i);
                }

            }
        });



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView textHead;
        public TextView textDescp;
        public LinearLayout linearLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            textHead=(TextView)itemView.findViewById(R.id.textHead);
            textDescp=(TextView)itemView.findViewById(R.id.textdescription);
            linearLayout=(LinearLayout)itemView.findViewById(R.id.linearLayout);
        }
    }
}
