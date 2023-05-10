package sg.edu.rp.c346.id22022096.democheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cbenabled;
    Button btnCheck;
    TextView tvShow;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbenabled = findViewById(R.id.cbEnabled);
        btnCheck = findViewById(R.id.btnCheck);
        tvShow = findViewById(R.id.tvShow);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MyActivity", "Inside onClick()");
                if (cbenabled.isChecked()){
                    double pay=calpay(100,20);
                    tvShow.setText("The discount is given. You need to pay "+pay);
                }else{
                    double pay=calpay(100,0);
                    tvShow.setText("The discount is not given. You need to pay "+pay);
                }
                Toast.makeText(MainActivity.this, "Button check", Toast.LENGTH_LONG).show();
            }
        });
    }

    private double calpay(double price, double disc) {
        double pay = price * (1 - disc/100);
        return pay;
    }
}