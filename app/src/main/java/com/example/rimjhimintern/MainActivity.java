package com.example.rimjhimintern;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.miguelcatalan.materialsearchview.MaterialSearchView;

public class MainActivity extends AppCompatActivity {
    MaterialSearchView searchView;
    ImageView imageView;
    BottomNavigationView bottomNavigationItemView;
    RecyclerView recyclervw;
    BadgeDrawable badgeDrawable,badgeDrawable1;
    private Activity context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Window window = getWindow();
        bottomNavigationItemView=findViewById(R.id.bottom_navigation);
        // clear FLAG_TRANSLUCENT_STATUS flag:
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        // add FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS flag to the window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

        // finally change the color
        window.setStatusBarColor(ContextCompat.getColor(getApplicationContext(),R.color.colorBg));
         badgeDrawable = bottomNavigationItemView.getOrCreateBadge(R.id.page_2);
        badgeDrawable1 = bottomNavigationItemView.getOrCreateBadge(R.id.page_2);
        badgeDrawable.isVisible();
        badgeDrawable.setNumber(3);
        badgeDrawable1.isVisible();
        badgeDrawable1.setNumber(3);
        imageView =  findViewById(R.id.image_spa);
        recyclervw=  findViewById(R.id.recylervw);

        FitnessLst[] myftnesslst=new FitnessLst[]{
                new FitnessLst("Diet", R.drawable.food),
                new FitnessLst("Stretching",R.drawable.stretch),
                new FitnessLst("Muscle gain",R.drawable.muscle),
                new FitnessLst("Lean more",R.drawable.aero),
                new FitnessLst("Yoga",R.drawable.yoga),
                new FitnessLst("Dance",R.drawable.dance),
                new FitnessLst("Meditation",R.drawable.med),
        };
        adapter myadapter =new adapter(getApplicationContext(), myftnesslst);
        //recyclervw.setLayoutManager(new LinearLayoutManager(this));
        LinearLayoutManager layoutManager = new LinearLayoutManager(context,RecyclerView.HORIZONTAL,false);
        recyclervw.setLayoutManager(layoutManager);
        recyclervw.setAdapter(myadapter);
        Glide.with(this).load(R.drawable.spa).centerCrop().into(imageView);
         //searchView = (MaterialSearchView) findViewById(R.id.search_view);

    }
   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.searchmenu, menu);

        MenuItem item = menu.findItem(R.id.action_search);
        searchView.setMenuItem(item);

        return true;
    }*/
}
