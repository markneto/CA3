package com.example.mobileapps1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.mobileapps1.models.Adaptor.CategoryAdaptor;
import com.example.mobileapps1.models.Adaptor.PopularAdaptor;
import com.example.mobileapps1.models.CartListActivity;
import com.example.mobileapps1.models.Domain.CategoryDomain;
import com.example.mobileapps1.models.Domain.ProdDomain;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class ProductCategoriesActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter, adapter2;
    private RecyclerView recyclerViewCategoryList, recyclerViewPopularList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_categories);


        recyclerViewCategory();
        recyclerViewPopular();
        bottomNavigation();
    }
    private void bottomNavigation(){
        FloatingActionButton floatingActionButton=findViewById(R.id.cartBtn);
        LinearLayout homeBtn=findViewById(R.id.homeBtn);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ProductCategoriesActivity.this,CartListActivity.class));

            }
        });

        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ProductCategoriesActivity.this, MainActivity.class));
            }
        });
    }
    private void recyclerViewCategory() {
        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false);
        recyclerViewCategoryList=findViewById(R.id.recyclerView);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> category= new ArrayList<>();
        category.add(new CategoryDomain("CD", "cat_1"));
        category.add(new CategoryDomain("DVD","cat_2"));
        category.add(new CategoryDomain("Vinyl","cat_3"));
        category.add(new CategoryDomain("RWTMerch","cat_4"));

        adapter=new CategoryAdaptor(category);
        recyclerViewCategoryList.setAdapter(adapter);
    }
    private void recyclerViewPopular() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false);
        recyclerViewPopularList=findViewById(R.id.recyclerView2);
        recyclerViewPopularList.setLayoutManager(linearLayoutManager);

        ArrayList<ProdDomain> prodList=new ArrayList<>();
        prodList.add(new ProdDomain("RENAISSANCE album","therenaissance","The highly anticipated seventh studio album from global icon Beyoncé. The singular intent of 'Renaissance', a reinvention of four on the floor, is to showcase music that stirs you from the soul and encourages your dancing feet.",14.90 ));
        prodList.add(new ProdDomain("I AM TOUR Dvd","iam","The I AM... WORLD TOUR concert film is an immersive entertainment experience, weaving together peak concert and tour footage from different shows around-the-world, including cities in Europe, Asia, South American and the US",7.90));
        prodList.add(new ProdDomain("BEYONCE Vinyl","beyonce","Edition of the R&B/Soul superstar's 2013 album includes the original 14 track album",7.90));
        prodList.add(new ProdDomain("RENAISSANCE TEE","merch","Official Beyoncé merchandise for RENAISSANCE WORLD TOUR 2023.  Merch Disco Cowboy Hat T-Shirt. 100% Cotton",40.00));

        adapter2= new PopularAdaptor(prodList);
        recyclerViewPopularList.setAdapter(adapter2);
    }
}