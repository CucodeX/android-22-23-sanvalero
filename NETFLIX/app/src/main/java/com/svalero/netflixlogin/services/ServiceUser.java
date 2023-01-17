package com.svalero.netflixlogin.services;

import android.widget.EditText;
import android.widget.Toast;

import com.svalero.netflixlogin.MainActivity;

public class ServiceUser {

    public static void validarUser(EditText user,EditText password){
        String email = user.getText().toString();
        String pass = password.getText().toString();

        if(!email.equals("") && email.length() >0 &&
                !pass.equals("") && pass.length() > 0 ){
            Toast.makeText(MainActivity.getInstance(),
                    "Email y Password correctas ...",
                    Toast.LENGTH_SHORT).show();
    }
}


}
