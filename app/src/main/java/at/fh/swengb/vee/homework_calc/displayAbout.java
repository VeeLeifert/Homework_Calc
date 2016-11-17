package at.fh.swengb.vee.homework_calc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class displayAbout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_about);
        Intent intent=getIntent();
        String message=intent.getStringExtra("data");
        TextView view= (TextView) findViewById(R.id.results);

        view.setText(message);


    }
}
