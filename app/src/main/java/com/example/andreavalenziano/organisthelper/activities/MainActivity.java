package com.example.andreavalenziano.organisthelper.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.andreavalenziano.organisthelper.R;
import com.example.andreavalenziano.organisthelper.adapters.CantiAdapter;
import com.example.andreavalenziano.organisthelper.models.Canto;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;

/**
 * Created by AndreaValenziano on 01/03/17.
 */

public class MainActivity extends AppCompatActivity {

    //recyclerview
    RecyclerView.LayoutManager linearLayoutManager;
    CantiAdapter adapter;
    RecyclerView cantiRv;

    //toolbar
    Toolbar mainToolbar;




    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //recyclerview
        cantiRv=(RecyclerView)findViewById(R.id.canti_rv);
        linearLayoutManager=new LinearLayoutManager(this);
        adapter=new CantiAdapter(this);

        cantiRv.setLayoutManager(linearLayoutManager);
        cantiRv.setAdapter(adapter);

        //toolbar
        mainToolbar=(Toolbar)findViewById(R.id.toolbar_main);
        setSupportActionBar(mainToolbar);
        getSupportActionBar().setTitle(R.string.app_name);
        adapter.setDataSet(getDefault());



    }
private ArrayList<Canto> getDefault(){
    ArrayList<Canto> defaultList=new ArrayList<>();
    defaultList.add(new Canto("Non di solo Pane", "Quaresima"));
   return defaultList;
}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");

    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }
}
