package at.fh.swengb.vee.homework_calc;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static at.fh.swengb.vee.homework_calc.R.id.editTextMeterInput;

public class MainActivity extends AppCompatActivity {

    private EditText editTextM2MM;
    private EditText editTextMM2M;
    private TextView resultViewM2MM;
    private TextView resultViewMM2M;

    private TextView textViewErgebnisM2MM;


    private EditText editTextMillimeterInput;

    private TextView textViewErgebnisMM2M;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextM2MM = (EditText) findViewById(editTextMeterInput);
        editTextMM2M = (EditText) findViewById(R.id.editTextMillimeterInput);

        resultViewM2MM = (TextView) findViewById(R.id.textViewErgebnisM2MM);
        resultViewMM2M = (TextView) findViewById(R.id.textViewErgebnisMM2M);


    }


    public void calcMM(View view){

        String mString = editTextM2MM.getText().toString();
        double resMM=0;

        try {
            resMM=Double.parseDouble(mString);
            double result=resMM*1000;

            resultViewM2MM.setText(result+"mm");

        } catch (NumberFormatException e) {
            resultViewM2MM.setText("Wrong input!!!!!!!!!");
            e.printStackTrace();

        }
    }
    public void calcM(View view){
        String mmString = editTextMM2M.getText().toString();
        double resM=0;
        try{
            resM=Double.parseDouble(mmString);
            double result2=resM/1000;
            resultViewMM2M.setText(result2+"m");

        }
        catch (NumberFormatException e){
            resultViewMM2M.setText("Wrong input!!!!!!!!!");
            e.printStackTrace();}
    }
}
