package com.example.foodappex1.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodappex1.Domain.CategoryDomain;
import com.example.foodappex1.Domain.PopularDomain;
import com.example.foodappex1.Domain.RecentDomain;
import com.example.foodappex1.R;
import com.example.foodappex1.adapter.CategoryAdapter;
import com.example.foodappex1.adapter.PopularAdapter;
import com.example.foodappex1.adapter.RecentAdapter;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
   private CategoryAdapter adapter;
    private PopularAdapter adapter1;
    private RecentAdapter adapter2;
    private RecyclerView recyclerViewCategoryList,recyclerViewPopularList,recyclerViewRecentList;
    View v;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_home,container,false);
        recyclerViewCategory();
        recyclerViewPopular();
        recyclerViewRecent();

        return v;
    }

    private void recyclerViewRecent() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerViewRecentList =v.findViewById(R.id.recyclerView3);
        recyclerViewRecentList.setLayoutManager(linearLayoutManager);

        ArrayList<RecentDomain> recentList = new ArrayList<>();
        recentList.add(new RecentDomain("fuska1",R.drawable.fuska1));
        recentList.add(new RecentDomain("fuska2",R.drawable.fuska2));
        recentList.add(new RecentDomain("fuska3",R.drawable.fuska3));
        recentList.add(new RecentDomain("fuska4",R.drawable.fuska4));
        recentList.add(new RecentDomain("fuska5",R.drawable.fuska5));

        adapter2 = new RecentAdapter(recentList);
        recyclerViewRecentList.setAdapter(adapter2);

    }

    private void recyclerViewCategory() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerViewCategoryList =v.findViewById(R.id.recyclerView);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> categoryList = new ArrayList<>();
        categoryList.add(new CategoryDomain("pizza1",R.drawable.pizza_1));
        categoryList.add(new CategoryDomain("pizza2",R.drawable.pizza_2));
        categoryList.add(new CategoryDomain("pizza3",R.drawable.pizza_3));
        categoryList.add(new CategoryDomain("pizza4",R.drawable.pizza_4));
        categoryList.add(new CategoryDomain("pizza5",R.drawable.pizza_5));

        adapter = new CategoryAdapter(categoryList);
        recyclerViewCategoryList.setAdapter(adapter);
    }

    private void recyclerViewPopular() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerViewPopularList = v.findViewById(R.id.recyclerView2);
        recyclerViewPopularList.setLayoutManager(linearLayoutManager);

        ArrayList<PopularDomain> popularList = new ArrayList<>();
        popularList.add(new PopularDomain("Pepperoni burger",R.drawable.burger_1,"",9.5));
        popularList.add(new PopularDomain("vegetable burger",R.drawable.burger_2,"",8.5));
        popularList.add(new PopularDomain("chicken burger",R.drawable.burger_3,"",7.5));
        popularList.add(new PopularDomain("hot burger",R.drawable.burger_4,"",6.5));
        popularList.add(new PopularDomain("cold burger",R.drawable.burger_5,"",5.5));

        adapter1 = new PopularAdapter(popularList);
        recyclerViewPopularList.setAdapter(adapter1);

    }

}
