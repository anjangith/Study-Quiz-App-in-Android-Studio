package duiet.developer.anjan.learnc;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class testActivity extends AppCompatActivity {
    private QuestionLibrary mQuestionLibrary=new QuestionLibrary();
    private TextView score;
    private TextView Question;
    private Button choice1;
    private Button choice2;
    private Button choice3;
    private Button choice4;
    private String mAnswer;
    public static int scorenum=0;
    private int mQuestionNumber=0;
    private int sharedQno=0;
    public static final String MY_PREFS_NAME="My_Preference";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        score=(TextView)findViewById(R.id.scoretext);
        Question=(TextView)findViewById(R.id.question);
        choice1=(Button)findViewById(R.id.choice1);
        choice2=(Button)findViewById(R.id.choice2);
        choice3=(Button)findViewById(R.id.choice3);
        choice4=(Button)findViewById(R.id.choice4);
        retriveFromSP();
        updateQuestion();
        scorenum=0;

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice1.getText() == mAnswer) {
                    if (mQuestionNumber < 20) {

                        Toast.makeText(getApplicationContext(), "CORRECT", Toast.LENGTH_LONG).show();
                        scorenum++;
                        updateScore(scorenum);
                        updateQuestion();
                        saveToPreference();
                    } else {
                        scorenum++;
                        updateScore(scorenum);
                        Intent i=new Intent(getApplicationContext(),finalscore.class);
                        startActivity(i);
                        finish();
                        saveToPreference();

                    }
                }
                 else {
                    if(mQuestionNumber<20){
                    Toast.makeText(getApplicationContext(),"MISTAKE",Toast.LENGTH_LONG).show();
                        updateQuestion();
                        saveToPreference();
                    }
                    else{

                        Intent i=new Intent(getApplicationContext(),finalscore.class);
                        startActivity(i);
                        saveToPreference();
                        finish();
                    }

                }
            }
        });

        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (choice2.getText() == mAnswer) {
                    if(mQuestionNumber<20){
                    Toast.makeText(getApplicationContext(),"CORRECT",Toast.LENGTH_LONG).show();
                    scorenum++;
                    saveToPreference();
                    updateScore(scorenum);
                        updateQuestion();}
                    else {
                        scorenum++;
                        saveToPreference();
                        updateScore(scorenum);
                    Intent i=new Intent(getApplicationContext(),finalscore.class);
                    startActivity(i);
                        finish();

                }


                } else {
                    if(mQuestionNumber<20) {

                        Toast.makeText(getApplicationContext(), "MISTAKE", Toast.LENGTH_LONG).show();
                        updateQuestion();
                        saveToPreference();
                    }
                    else {
                        Intent i= new Intent(getApplicationContext(),finalscore.class);
                        startActivity(i);
                        saveToPreference();
                        finish();
                    }


                }
            }
        });


        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice3.getText() == mAnswer) {
                    if(mQuestionNumber<20){
                        Toast.makeText(getApplicationContext(),"CORRECT",Toast.LENGTH_LONG).show();
                        scorenum++;
                        updateScore(scorenum);
                        updateQuestion();
                    saveToPreference();}
                    else {
                        scorenum++;
                        updateScore(scorenum);
                        Intent i=new Intent(getApplicationContext(),finalscore.class);
                        startActivity(i);
                        saveToPreference();
                        finish();

                    }


                } else {
                    if(mQuestionNumber<20) {
                        Toast.makeText(getApplicationContext(), "MISTAKE", Toast.LENGTH_LONG).show();
                        updateQuestion();
                        saveToPreference();
                    }
                    else {
                        Intent i= new Intent(getApplicationContext(),finalscore.class);
                        startActivity(i);
                        saveToPreference();
                        finish();
                    }


                }
            }
        });

        choice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (choice4.getText() == mAnswer) {
                    if(mQuestionNumber<20){
                        Toast.makeText(getApplicationContext(),"CORRECT",Toast.LENGTH_LONG).show();
                        scorenum++;
                        updateScore(scorenum);
                        saveToPreference();
                        updateQuestion();}
                    else {
                        scorenum++;
                        updateScore(scorenum);
                        Intent i=new Intent(getApplicationContext(),finalscore.class);
                        startActivity(i);
                        saveToPreference();
                        finish();

                    }


                } else {
                    if(mQuestionNumber<20) {
                        Toast.makeText(getApplicationContext(), "MISTAKE", Toast.LENGTH_LONG).show();
                        updateQuestion();
                        saveToPreference();
                    }
                    else {
                        Intent i= new Intent(getApplicationContext(),finalscore.class);
                        startActivity(i);
                        saveToPreference();
                        finish();
                    }


                }
            }
        });

    }
    private void updateQuestion(){
        if(sharedQno>=40){
            sharedQno=0;
            saveToPreference();
        }
        Question.setText(mQuestionLibrary.getQuestion(sharedQno));
        choice1.setText(mQuestionLibrary.getChoiceA(sharedQno));
        choice2.setText(mQuestionLibrary.getChoiceB(sharedQno));
        choice3.setText(mQuestionLibrary.getChoiceC(sharedQno));
        choice4.setText(mQuestionLibrary.getChoiceD(sharedQno));
        mAnswer=mQuestionLibrary.getAnswer(sharedQno);
        mQuestionNumber++;
        sharedQno++;

    }

    private void saveToPreference() {
        SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();
        editor.putInt("pos", sharedQno);
        editor.apply();
    }

    private void retriveFromSP(){
        SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);

            sharedQno = prefs.getInt("pos", 0);


    }

    private void updateScore(int scorenum){
        score.setText("" +scorenum);
    }
}

