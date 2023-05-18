package com.example.vkrfoodapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FavoriteFoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_food);

        Button goToMenuButton;
        Button goToCardButton;

        goToMenuButton = findViewById(R.id.button_menu);
        goToCardButton = findViewById(R.id.button_basket);
        Show();

        goToMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FavoriteFoodActivity.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        });

        goToCardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FavoriteFoodActivity.this, CardActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);
            }
        });
    }

    private void Show()
    {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        MenuItemFragment menuItemFragment = new MenuItemFragment(2, 0);
        fragmentTransaction.add(R.id.favorite_food_container, menuItemFragment);
        fragmentTransaction.commit();
    }
}