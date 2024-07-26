package thanhncph30708.fpoly.lab6_nc;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    Button btnStart,btnStop,btnBackgroundService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnStart=findViewById(R.id.demo62BtnStart);
        btnStop=findViewById(R.id.demo62BtnStop);
        btnStart.setOnClickListener(v->{
            startService(new Intent(MainActivity2.this,
                    ForcegroundService.class));
        });
        btnStop.setOnClickListener(v->{
            startService(new Intent(MainActivity2.this,
                    ForcegroundService.class));
        });
        btnBackgroundService=findViewById(R.id.demo62BtnBackgroundService);
        btnBackgroundService.setOnClickListener(v->{
            startService(new Intent(MainActivity2.this,
                    BackgroundService.class));
        });
    }
}