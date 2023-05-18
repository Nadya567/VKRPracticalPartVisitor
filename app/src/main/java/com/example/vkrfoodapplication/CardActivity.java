package com.example.vkrfoodapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

public class CardActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        Button goToFavoriteFoodButton;
        Button goToMenuButton;
        Button makeOrderButton;
        TextView orderPrice;

        goToFavoriteFoodButton = findViewById(R.id.button_favorite);
        goToMenuButton = findViewById(R.id.button_menu);
        makeOrderButton = findViewById(R.id.make_order_button);
        orderPrice = findViewById(R.id.finish_price_text);

        Show();

        goToFavoriteFoodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CardActivity.this, FavoriteFoodActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        goToMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CardActivity.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
            }
        });

        makeOrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FrameLayout layout = findViewById(R.id.favorite_food_container);
                layout.removeAllViews();
                orderPrice.setText("0 руб");

                Toast.makeText(CardActivity.this, "Заказ оформлен", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void Show()
    {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        MenuItemFragment menuItemFragment = new MenuItemFragment(2, 2);
        fragmentTransaction.add(R.id.favorite_food_container, menuItemFragment);
        fragmentTransaction.commit();
    }
}
