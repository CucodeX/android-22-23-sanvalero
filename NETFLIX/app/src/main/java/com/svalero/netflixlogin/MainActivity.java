package com.svalero.netflixlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.svalero.netflixlogin.services.ServiceUser;


public class MainActivity extends AppCompatActivity {
    private static MainActivity parent;
    public static MainActivity getInstance(){
        return parent;
    }
    @Override
    // ON LOAD JAVASCRIPT
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ON LOAD JAVASCRIPT
        initComponents();
        this.parent = this;
    }
    ;
    private EditText edtUser;
    private EditText edtPassword;
    private Button btnLogin;
    private void initComponents(){
         edtUser      = findViewById(R.id.edtUser);
         edtPassword  = findViewById(R.id.edtPassword);
         btnLogin     = findViewById(R.id.btnLogin);
         btnLogin.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view){
                ServiceUser.validarUser(edtUser,edtPassword);
             }
         });


    }

}