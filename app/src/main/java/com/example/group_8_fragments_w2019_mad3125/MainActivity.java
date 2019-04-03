package com.example.group_8_fragments_w2019_mad3125;

        import android.support.v4.app.Fragment;
        import android.support.v4.app.FragmentManager;
        import android.support.v4.app.FragmentTransaction;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void selectFragment(View v) {
        Fragment fragment;
        if (v == findViewById(R.id.btn1)) {
            fragment = new FragmentOne();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.frag, fragment);
            ft.commit();

        }
        if (v == findViewById(R.id.btn2)) {
            fragment = new FragmentTwo();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.frag, fragment);
            ft.commit();

        }
        if (v == findViewById(R.id.btn3)) {
            fragment = new FragmentThree();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.frag, fragment);
            ft.commit();
        }


    }
}
