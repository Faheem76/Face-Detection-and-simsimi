package detection.image.realtime.onlyfacedetection;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Switch_Emotion_Simsimi extends AppCompatActivity {

    Button face,chat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch__emotion__simsimi);


        face=(Button)findViewById(R.id.switch_face);
        chat=(Button)findViewById(R.id.switch_simsimi);


        face.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Switch_Emotion_Simsimi.this,MainActivity.class);
                startActivity(intent);
            }
        });
        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Switch_Emotion_Simsimi.this,Simsimi.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Switch_Emotion_Simsimi.this.finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about:
                startActivity(new Intent(this, About.class));
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }


    }


