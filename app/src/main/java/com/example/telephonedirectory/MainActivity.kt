package com.example.telephonedirectory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    var itemsList:ArrayList<Information> = arrayListOf(
        Information("ID55001", "Duy Tran", "0837198139", "testEmail@gmail.com"),
        Information("ID55001", "Duy Tran", "0837198139", "testEmail@gmail.com"),
        Information("ID55001", "Duy Tran", "0837198139", "testEmail@gmail.com"),
        Information("ID55001", "Duy Tran", "0837198139", "testEmail@gmail.com"),
        Information("ID55001", "Duy Tran", "0837198139", "testEmail@gmail.com"),
        Information("ID55001", "Duy Tran", "0837198139", "testEmail@gmail.com"),
        Information("ID55001", "Duy Tran", "0837198139", "testEmail@gmail.com"),
    );

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView:ListView = findViewById(R.id.list_view);
        val adapter = ListViewAdapter(this, itemsList);
        listView.adapter = adapter;
        listView.isClickable = true;
        listView.setOnItemClickListener { parent, view, position, id ->
            val id = itemsList[position].id;
            val name = itemsList[position].name;
            val phoneNumber = itemsList[position].phoneNumber;
            val email = itemsList[position].email;

            val i = Intent(this, InformationActivity::class.java);
            i.putExtra("id", id);
            i.putExtra("name", name);
            i.putExtra("phoneNumber", phoneNumber);
            i.putExtra("email", email);
            Log.v("TAG", "Item clicked")
            startActivity(i);
        }
        registerForContextMenu(listView);
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        menuInflater.inflate(R.menu.main_menu, menu)
        super.onCreateContextMenu(menu, v, menuInfo)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        return super.onContextItemSelected(item)
    }
}