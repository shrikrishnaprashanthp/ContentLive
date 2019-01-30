package com.primefocus.mobile.contentlive.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.primefocus.mobile.contentlive.R;

public class LoginFragment extends Fragment implements View.OnClickListener {

    private EditText username,password;
    private Button btnlogin;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
       // return inflater.inflate(R.layout.fragment_loginfragment, container, false);
        View view = inflater.inflate(R.layout.fragment_loginfragment, container, false);
        username =  view.findViewById(R.id.user_id);
        password = view.findViewById(R.id.password);
        btnlogin = view.findViewById(R.id.btn_login);
        btnlogin.setOnClickListener(this);
        //SharedPreferences settings = this.getActivity().getSharedPreferences("PREFS", 0);
       // notatki.setText(settings.getString("value", ""));

        //loginInfo(username,password);



      /*  btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginInfo(username,password);
            }
        });*/

        return view; // return view here instead of notaki
    }


    private void loginInfo(EditText username,EditText password){
        String usernameString=username.getText().toString();
        String passwordString=password.getText().toString();

        if(usernameString.isEmpty()){
            Toast.makeText(getActivity().getApplicationContext(),getActivity().getString(R.string.usernameempty),Toast.LENGTH_LONG).show();
        }else if(passwordString.isEmpty()){
            Toast.makeText(getActivity().getApplicationContext(),getActivity().getString(R.string.passwordempty),Toast.LENGTH_LONG).show();
        }else {

            Toast.makeText(getActivity().getApplicationContext(),getActivity().getString(R.string.user_login_success),Toast.LENGTH_LONG).show();




        }
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
           /* case  R.id.btn_login: {
                Toast.makeText(getActivity().getApplicationContext(), "Clicked", Toast.LENGTH_LONG).show();
                loginInfo(username,password);
                break;
            }*/

            case R.id.btn_login:
            {
                Toast.makeText(getActivity().getApplicationContext(), "Clicked", Toast.LENGTH_LONG).show();
                loginInfo(username,password);
                break;
            }
        }
    }
}
