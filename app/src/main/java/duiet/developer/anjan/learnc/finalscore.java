package duiet.developer.anjan.learnc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class finalscore extends AppCompatActivity {
    private TextView refer;
    private AdView mAdView;
    private Button continueBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalscore);
        MobileAds.initialize(this,"ca-app-pub-1836307550568566~8067204975");
        refer=(TextView)findViewById(R.id.refer);
        refer.setText(String.valueOf(testActivity.scorenum));

        continueBtn=(Button)findViewById(R.id.conti);
        continueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(finalscore.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });


    }
}
