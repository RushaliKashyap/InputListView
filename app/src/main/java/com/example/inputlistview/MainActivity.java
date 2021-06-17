package com.example.inputlistview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    ListView listView;
    ArrayList<String> arrayList;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.text);
        button = findViewById(R.id.button);
        listView = findViewById(R.id.list);

        arrayList = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(adapter);
        onbtnclick();
    }

    private void onbtnclick() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = editText.getText().toString();
                arrayList.add(result);
                adapter.notifyDataSetChanged();
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.item1)
        {
            Toast.makeText(MainActivity.this,"You have selected contact us",Toast.LENGTH_LONG).show();
        }
        if(id == R.id.item2)
        {
            Toast.makeText(MainActivity.this,"You have selected about us",Toast.LENGTH_LONG).show();
        }
        if(id == R.id.item3)
        {
            Toast.makeText(MainActivity.this,"what can i help you",Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }



}