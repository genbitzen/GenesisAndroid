package iss.workshop.genesis;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import iss.workshop.genesis.CRUD.Create;
import iss.workshop.genesis.CRUD.Delete;
import iss.workshop.genesis.CRUD.Read;
import iss.workshop.genesis.CRUD.Update;

public class MainActivity extends AppCompatActivity {

    Intent intentToCreate, intentToRead, intentToUpdate, intentToDelete;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intentToCreate = new Intent(this, Create.class );
        intentToDelete = new Intent( this, Delete.class);
        intentToRead = new Intent(this, Read.class);
        intentToUpdate = new Intent(this, Update.class);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.mainmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //create a switch to listen for selected item
        switch(item.getItemId()){
            case R.id.create:
                startActivity(intentToCreate);
                break;
            case R.id.delete:
                startActivity(intentToDelete);
                break;
            case R.id.read:
                startActivity(intentToRead);
                break;
            case R.id.update:
                startActivity(intentToUpdate);
                break;
        }
        return true;
    }
}