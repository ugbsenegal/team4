package com.drawer.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Hommes extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hommes);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //List of items
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item("Kimono","h1",9000,getString(R.string.h1)));
        itemList.add(new Item("Brown Costume Africain","h2",30000,getString(R.string.h2)));
        itemList.add(new Item("Bomber","h3",10000,getString(R.string.h3)));
        itemList.add(new Item("Manteau","h4",20000,getString(R.string.h4)));
        itemList.add(new Item("Pi-Combi","h5",12000,getString(R.string.h5)));
        itemList.add(new Item("Pull Col Roule","h6",7000,getString(R.string.h6)));
        itemList.add(new Item("Black Costume Aficain","h7",30000,getString(R.string.h7)));
        itemList.add(new Item("Pull Col V","h8",7000,getString(R.string.h8)));
        itemList.add(new Item("Grand-Bubu","h9",10000,getString(R.string.h9)));
        itemList.add(new Item("Sweat-Shirt","h10",8000,getString(R.string.h10)));
        //get listview

        ListView shopListView = findViewById(R.id.shop_list_view);
        shopListView.setAdapter(new ItemAdapter(getApplicationContext(),itemList));





    }


        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.main, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
        /*if (id == R.id.action_settings) {
            return true;
        }*/

            return super.onOptionsItemSelected(item);
        }

        @SuppressWarnings("StatementWithEmptyBody")
        @Override
        public boolean onNavigationItemSelected(MenuItem item) {
            // Handle navigation view item clicks here.
            int id = item.getItemId();

            if (id == R.id.nav_gallery ){
                // Handle the camera action
            } else if (id == R.id.nav_slideshow) {

            } else if (id == R.id.nav_manage) {

            } else if (id == R.id.nav_create) {

            }

            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            drawer.closeDrawer(GravityCompat.START);
            return true;
        }


}
