package com.example.sharedpref_sampletwo_android_github;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.sharedpref_sampletwo_android_github.Model.DataItem;
import com.example.sharedpref_sampletwo_android_github.SampleDataProvider.SampleDataProvider;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private DataItemAdapter dataItemAdapter;
    private List<DataItem> dataItemList = SampleDataProvider.dataItemList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataItemAdapter = new DataItemAdapter(this,dataItemList);

        SharedPreferences settingPrefs = PreferenceManager.getDefaultSharedPreferences(this);
        boolean grid = settingPrefs.getBoolean(getString(R.string.key_settings),false);


        recyclerView = findViewById(R.id.recycler_view);

        if(grid){
            recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        }

        recyclerView.setAdapter(dataItemAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()){
            case R.id.action_setting:
                Intent intent = new Intent(this,SettingActivity.class);
                startActivity(intent);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
