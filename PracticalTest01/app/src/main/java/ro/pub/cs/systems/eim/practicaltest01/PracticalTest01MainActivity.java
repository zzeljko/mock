package ro.pub.cs.systems.eim.practicaltest01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PracticalTest01MainActivity extends AppCompatActivity {

    private Button but1;
    private Button but2;
    private EditText editTextLeft;
    private EditText editTextRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_main);

        but1 = findViewById(R.id.but1);
        but2 = findViewById(R.id.but2);
        editTextLeft = findViewById(R.id.editTextLeft);
        editTextRight = findViewById(R.id.editTextRight);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextLeft.setText(Integer.parseInt(editTextLeft.getText().toString()) + 1 + "");
            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextRight.setText(Integer.parseInt(editTextRight.getText().toString()) + 1 + "");
            }
        });

    }
}
