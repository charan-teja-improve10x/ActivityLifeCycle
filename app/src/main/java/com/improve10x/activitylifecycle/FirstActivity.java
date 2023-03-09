package com.improve10x.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Toast.makeText(this, "On Create Method Called", Toast.LENGTH_SHORT).show();
        Log.d("LIFE CYCLE", "On Create Method Called");
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(v -> {
            Intent mainIntent = new Intent(this,MainActivity.class);
            startActivity(mainIntent);
            finish();
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "On Start Method Called", Toast.LENGTH_SHORT).show();
        Log.d("LIFE CYCLE", "On Start Method Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "On Resume Method Called", Toast.LENGTH_SHORT).show();
        Log.d("LIFE CYCLE", "On Resume Method Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "On Pause Method Called", Toast.LENGTH_SHORT).show();
        Log.d("LIFE CYCLE", "On Pause Method Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "On Stop Method Called", Toast.LENGTH_SHORT).show();
        Log.d("LIFE CYCLE", "On Stop Method Called");
    }

}