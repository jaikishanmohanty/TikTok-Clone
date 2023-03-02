package com.example.tiktokclone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.tiktokclone.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
ArrayList<Model> arrayList = new ArrayList<>();
Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN );
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        this.getTheme().applyStyle(R.style.FullScreen, false);
        arrayList.add((new Model( "android.resource://"+ getPackageName() + "/"+ R.raw.a, R.drawable.man, "Jaikishan Mohanty")));
        arrayList.add((new Model( "android.resource://"+ getPackageName() + "/"+ R.raw.b, R.drawable.man, "Jaikishan Mohanty")));
        arrayList.add((new Model( "android.resource://"+ getPackageName() + "/"+ R.raw.c, R.drawable.man, "Jaikishan Mohanty")));
        arrayList.add((new Model( "android.resource://"+ getPackageName() + "/"+ R.raw.d, R.drawable.man, "Jaikishan Mohanty")));
        arrayList.add((new Model( "android.resource://"+ getPackageName() + "/"+ R.raw.e, R.drawable.man, "Jaikishan Mohanty")));
        adapter = new Adapter(MainActivity.this, arrayList);
        binding.viewPager2.setAdapter(adapter);
    }
}