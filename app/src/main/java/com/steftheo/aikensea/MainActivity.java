package com.steftheo.aikensea;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.steftheo.aikensea.adapter.ProductAdapter;
import com.steftheo.aikensea.adapter.ProductCategoryAdapter;
import com.steftheo.aikensea.model.ProductCategory;
import com.steftheo.aikensea.model.Products;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView productCatRecycler, prodItemRecycler;
    ProductCategoryAdapter productCategoryAdapter;
    ProductAdapter productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<ProductCategory> productsCategoryList = new ArrayList<>();
        productsCategoryList.add(new ProductCategory(1, "Trending Collections"));
        productsCategoryList.add(new ProductCategory(2, "Hot Items"));
        productsCategoryList.add(new ProductCategory(3, "Expiring Soon"));
        productsCategoryList.add(new ProductCategory(4, "New Top Sellers"));

        setProductCatRecycler(productsCategoryList);

        List<Products> productsList = new ArrayList<>();
        productsList.add(new Products(1, "Bored Ape Yacht Club", "#0001", "$ 17.00", R.drawable.prod2));
        productsList.add(new Products(2, "Bored Ape Yacht Club [Bitcoin Limited]", "#0002", "$ 25.00", R.drawable.prod1));
        productsList.add(new Products(1, "Bored Ape Yacht Club", "#0001", "$ 17.00", R.drawable.prod2));
        productsList.add(new Products(2, "Bored Ape Yacht Club [Bitcoin Limited]", "#0002", "$ 25.00", R.drawable.prod1));
        productsList.add(new Products(1, "Bored Ape Yacht Club", "#0001", "$ 17.00", R.drawable.prod2));
        productsList.add(new Products(2, "Bored Ape Yacht Club [Bitcoin Limited]", "#0002", "$ 25.00", R.drawable.prod1));

        setProdItemRecycler(productsList);


    }

    private void setProductCatRecycler(List<ProductCategory> productCategoryList){

        productCatRecycler = findViewById(R.id.cat_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        productCatRecycler.setLayoutManager(layoutManager);
        productCategoryAdapter = new ProductCategoryAdapter(this, productCategoryList);
        productCatRecycler.setAdapter(productCategoryAdapter);

    }
    private void setProdItemRecycler(List<Products> productsList){

        prodItemRecycler = findViewById(R.id.product_recycler);
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        prodItemRecycler.setLayoutManager(layoutManager);
        ProductAdapter productAdapter = new ProductAdapter(this, productsList);
        prodItemRecycler.setAdapter(productAdapter);

    }



}