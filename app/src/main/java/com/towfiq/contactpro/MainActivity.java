package com.towfiq.contactpro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.viewpager.widget.ViewPager;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity implements RecyclerViewAdapter.CallInterface {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayoutID);
        viewPager = findViewById(R.id.viewPagerID);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        //add fragment here
        viewPagerAdapter.addFragment(new CallFragment(), "");
        viewPagerAdapter.addFragment(new ContactFragment(), "");
        viewPagerAdapter.addFragment(new FavouriteFragment(), "");

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_call);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_contact);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_fav);


    }

    @Override
    public void callBtn(String phoneNumber) {
        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse("tel:"+Uri.encode(phoneNumber.trim())));
        callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(callIntent);
    }
}











