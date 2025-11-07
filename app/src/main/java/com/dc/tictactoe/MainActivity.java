package com.dc.tictactoe;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button bn1,bn2,bn3,bn4,bn5,bn6,bn7,bn8,bn9;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9;
    LinearLayout llmain;


    int flag=0;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llmain=findViewById(R.id.llmain);

        init();

    }

    private void init(){
        bn1=findViewById(R.id.bn1);
        bn2=findViewById(R.id.bn2);
        bn3=findViewById(R.id.bn3);
        bn4=findViewById(R.id.bn4);
        bn5=findViewById(R.id.bn5);
        bn6=findViewById(R.id.bn6);
        bn7=findViewById(R.id.bn7);
        bn8=findViewById(R.id.bn8);
        bn9=findViewById(R.id.bn9);

    }

    public void check(View v){
        Button curButton=(Button)v;

        if(curButton.getText().toString().equals("")){

            count++;

            if(flag==0){
                curButton.setText("X");
                flag=1;
            }else{
                curButton.setText("O");
                flag=0;
            }

            if(count>4){
                b1=bn1.getText().toString();
                b2=bn2.getText().toString();
                b3=bn3.getText().toString();
                b4=bn4.getText().toString();
                b5=bn5.getText().toString();
                b6=bn6.getText().toString();
                b7=bn7.getText().toString();
                b8=bn8.getText().toString();
                b9=bn9.getText().toString();

                if(b1.equals(b2) && b2.equals(b3) && !b1.equals("")){
                    Toast.makeText(this,"Winner is "+b1,Toast.LENGTH_SHORT).show();
                    delay("Winner is "+b1);
                }else if(b4.equals(b5) && b5.equals(b6) && !b4.equals("")){
                    Toast.makeText(this,"Winner is "+b4,Toast.LENGTH_SHORT).show();
                    delay("Winner is "+b4);
                }else if(b7.equals(b8) && b8.equals(b9) && !b7.equals("")){
                    Toast.makeText(this,"Winner is "+b7,Toast.LENGTH_SHORT).show();
                    delay("Winner is "+b7);
                }else if(b1.equals(b4) && b4.equals(b7) && !b1.equals("")){
                    Toast.makeText(this,"Winner is "+b1,Toast.LENGTH_SHORT).show();
                    delay("Winner is "+b1);
                }
                else if(b2.equals(b5) && b5.equals(b8) && !b2.equals("")){
                    Toast.makeText(this,"Winner is "+b2,Toast.LENGTH_SHORT).show();
                    delay("Winner is "+b2);
                }
                else if(b3.equals(b6) && b6.equals(b9) && !b3.equals("")){
                    Toast.makeText(this,"Winner is "+b3,Toast.LENGTH_SHORT).show();
                    delay("Winner is "+b3);
                }else if(b1.equals(b5) && b5.equals(b9) && !b1.equals("")){
                    Toast.makeText(this,"Winner is "+b1,Toast.LENGTH_SHORT).show();
                    delay("Winner is "+b1);
                }else if(b3.equals(b5) && b5.equals(b7) && !b3.equals("")){
                    Toast.makeText(this,"Winner is "+b3,Toast.LENGTH_SHORT).show();
                    delay("Winner is "+b3);
                }else if(count==9){
                    Toast.makeText(this,"Game is draw",Toast.LENGTH_SHORT).show();
                    delay("This game is draw");

                }

            }
        }

    }

    public void delay(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
        if(count==9){
            llmain.setBackgroundColor(ContextCompat.getColor(llmain.getContext(),R.color.draw));
             color1();
        }else{
            llmain.setBackgroundColor(ContextCompat.getColor(llmain.getContext(),R.color.win));
              color1();
        }
        disabled();
        bn1.postDelayed(new Runnable() {
            @Override
            public void run() {
                restart();
                enable();
                llmain.setBackgroundColor(ContextCompat.getColor(llmain.getContext(),R.color.white));
                color2();
            }
        },5000);
    }

    public void restart(){
        bn1.setText("");
        bn2.setText("");
        bn3.setText("");
        bn4.setText("");
        bn5.setText("");
        bn6.setText("");
        bn7.setText("");
        bn8.setText("");
        bn9.setText("");
        count=0;
        flag=0;

    }

    private void enable(){
        bn1.setEnabled(true);
        bn2.setEnabled(true);
        bn3.setEnabled(true);
        bn4.setEnabled(true);
        bn5.setEnabled(true);
        bn6.setEnabled(true);
        bn7.setEnabled(true);
        bn8.setEnabled(true);
        bn9.setEnabled(true);
    }

    private void disabled(){
        bn1.setEnabled(false);
        bn2.setEnabled(false);
        bn3.setEnabled(false);
        bn4.setEnabled(false);
        bn5.setEnabled(false);
        bn6.setEnabled(false);
        bn7.setEnabled(false);
        bn8.setEnabled(false);
        bn9.setEnabled(false);

    }

    private void colorDelay(){
        bn1.postDelayed(new Runnable() {
            @Override
            public void run() {
                color1();
            }
        },5000);
    }

    private void color1(){
        bn1.setBackgroundColor(ContextCompat.getColor(bn1.getContext(),R.color.black));
        bn1.setTextColor(ContextCompat.getColor(bn1.getContext(),R.color.c1));
        bn2.setBackgroundColor(ContextCompat.getColor(bn2.getContext(),R.color.black));
        bn2.setTextColor(ContextCompat.getColor(bn2.getContext(),R.color.c1));
        bn3.setBackgroundColor(ContextCompat.getColor(bn3.getContext(),R.color.black));
        bn3.setTextColor(ContextCompat.getColor(bn3.getContext(),R.color.c1));
        bn4.setBackgroundColor(ContextCompat.getColor(bn4.getContext(),R.color.black));
        bn4.setTextColor(ContextCompat.getColor(bn4.getContext(),R.color.c1));
        bn5.setBackgroundColor(ContextCompat.getColor(bn5.getContext(),R.color.black));
        bn5.setTextColor(ContextCompat.getColor(bn5.getContext(),R.color.c1));
        bn6.setBackgroundColor(ContextCompat.getColor(bn6.getContext(),R.color.black));
        bn6.setTextColor(ContextCompat.getColor(bn6.getContext(),R.color.c1));
        bn7.setBackgroundColor(ContextCompat.getColor(bn7.getContext(),R.color.black));
        bn7.setTextColor(ContextCompat.getColor(bn7.getContext(),R.color.c1));
        bn8.setBackgroundColor(ContextCompat.getColor(bn8.getContext(),R.color.black));
        bn8.setTextColor(ContextCompat.getColor(bn8.getContext(),R.color.c1));
        bn9.setBackgroundColor(ContextCompat.getColor(bn9.getContext(),R.color.black));
        bn9.setTextColor(ContextCompat.getColor(bn9.getContext(),R.color.c1));

    }

    private void color2(){
        bn1.setBackgroundColor(ContextCompat.getColor(bn1.getContext(),R.color.btn));
        bn2.setBackgroundColor(ContextCompat.getColor(bn2.getContext(),R.color.btn));
        bn3.setBackgroundColor(ContextCompat.getColor(bn3.getContext(),R.color.btn));
        bn4.setBackgroundColor(ContextCompat.getColor(bn4.getContext(),R.color.btn));
        bn5.setBackgroundColor(ContextCompat.getColor(bn5.getContext(),R.color.btn));
        bn6.setBackgroundColor(ContextCompat.getColor(bn6.getContext(),R.color.btn));
        bn7.setBackgroundColor(ContextCompat.getColor(bn7.getContext(),R.color.btn));
        bn8.setBackgroundColor(ContextCompat.getColor(bn8.getContext(),R.color.btn));
        bn9.setBackgroundColor(ContextCompat.getColor(bn9.getContext(),R.color.btn));
    }

}