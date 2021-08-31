package com.example.foodappex1.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.foodappex1.Domain.CategoryDomain;
import com.example.foodappex1.Domain.CategoryDomain;
import com.example.foodappex1.Domain.PopularDomain;
import com.example.foodappex1.Domain.RecentDomain;
import com.example.foodappex1.Fragment.HomeFragment;
import com.example.foodappex1.Fragment.ProfileFragment;
import com.example.foodappex1.Fragment.SettingsFragment;
import com.example.foodappex1.Fragment.SupportFragment;
import com.example.foodappex1.R;
import com.example.foodappex1.adapter.CategoryAdapter;
import com.example.foodappex1.adapter.PopularAdapter;
import com.example.foodappex1.adapter.RecentAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

public class IntroActivity extends AppCompatActivity {private CategoryAdapter adapter;
    private PopularAdapter adapter1;
    private RecentAdapter adapter2;
    private RecyclerView recyclerViewCategoryList,recyclerViewPopularList,recyclerViewRecentList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationViewId);
        bottomNavigationView.setBackground(null);

        /*recyclerViewCategory();
        recyclerViewPopular();
        recyclerViewRecent();*/

        BottomNavigationView bottomNav = findViewById(R.id.bottomNavigationViewId);
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayoutId, new HomeFragment()).commit();
        bottomNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                switch (item.getItemId()){
                    case R.id.homeId:
                        fragment = new HomeFragment();
                        break;
                    case R.id.profileId:
                        fragment = new ProfileFragment();
                        break;
                    case R.id.supportId:
                        fragment = new SupportFragment();
                        break;
                    case R.id.settingsId:
                        fragment = new SettingsFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayoutId, fragment).commit();
                return true;
            }
        });
    }

   /* private void recyclerViewRecent() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewRecentList = findViewById(R.id.recyclerView3);
        recyclerViewRecentList.setLayoutManager(linearLayoutManager);

        ArrayList<RecentDomain> recentList = new ArrayList<>();
        recentList.add(new RecentDomain("fuska1",R.drawable.fuska1));
        recentList.add(new RecentDomain("fuska2",R.drawable.fuska2));
        recentList.add(new RecentDomain("fuska3",R.drawable.fuska3));
        recentList.add(new RecentDomain("fuska3",R.drawable.fuska4));
        recentList.add(new RecentDomain("fuska5",R.drawable.fuska5));

        adapter2 = new RecentAdapter(recentList);
        recyclerViewRecentList.setAdapter(adapter2);

    }*/

    /*private void recyclerViewCategory() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewCategoryList =findViewById(R.id.recyclerView);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> categoryList = new ArrayList<>();
        categoryList.add(new CategoryDomain("pizza1",R.drawable.pizza_1));
        categoryList.add(new CategoryDomain("pizza2",R.drawable.pizza_2));
        categoryList.add(new CategoryDomain("pizza3",R.drawable.pizza_3));
        categoryList.add(new CategoryDomain("pizza4",R.drawable.pizza_4));
        categoryList.add(new CategoryDomain("pizza5",R.drawable.pizza_5));

        adapter = new CategoryAdapter(categoryList);
        recyclerViewCategoryList.setAdapter(adapter);
    }*/


   /* private void recyclerViewPopular() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewPopularList = findViewById(R.id.recyclerView2);
        recyclerViewPopularList.setLayoutManager(linearLayoutManager);

        ArrayList<PopularDomain> popularList = new ArrayList<>();
        popularList.add(new PopularDomain("Pepperoni burger",R.drawable.burger_1,"",9.5));
        popularList.add(new PopularDomain("vegetable burger",R.drawable.burger_2,"",8.5));
        popularList.add(new PopularDomain("chicken burger",R.drawable.burger_3,"",7.5));
        popularList.add(new PopularDomain("hot burger",R.drawable.burger_4,"",6.5));
        popularList.add(new PopularDomain("cold burger",R.drawable.burger_5,"",5.5));

        adapter1 = new PopularAdapter(popularList);
        recyclerViewPopularList.setAdapter(adapter1);
    }*/
    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment = null;
            switch (item.getItemId()){
                case R.id.homeId:
                    fragment = new HomeFragment();
                    break;
                case R.id.profileId:
                    fragment = new ProfileFragment();
                    break;
                case R.id.supportId:
                    fragment = new SupportFragment();
                    break;
                case R.id.settingsId:
                    fragment = new SettingsFragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.frameLayoutId, fragment).commit();
            return true;
        }

    };

}