package com.example.mybeautybooking.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mybeautybooking.ClientLoginActivity;
import com.example.mybeautybooking.HomePage;
import com.example.mybeautybooking.R;

public class RepotoireBeautyActivity extends AppCompatActivity {

    Button connexionB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repotoire_beauty);

        connexionB = (Button) findViewById(R.id.btn_connexion);
        connexionB.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View v) {

            Intent intent = new Intent(RepotoireBeautyActivity.this, ClientLoginActivity.class);
            startActivity(intent);
        }
    });


}
}
