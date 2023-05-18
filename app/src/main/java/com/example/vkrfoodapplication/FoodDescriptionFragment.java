package com.example.vkrfoodapplication;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class FoodDescriptionFragment extends Fragment {

    private int dishNumber;
    private int category;

    ImageView bigPicture;
    TextView textTitle;
    TextView textDescription;

    public FoodDescriptionFragment(int _number, int _category) {
        dishNumber = _number;
        category = _category;

        Log.d("!!!!!", Integer.toString(dishNumber));
        Log.d("!!!!!!", Integer.toString(category));


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();

       bigPicture = view.findViewById(R.id.big_food_image);
       textTitle = view.findViewById(R.id.food_title);
       textDescription = view.findViewById(R.id.food_description);

        FragmentFilling();
    }

    private void FragmentFilling()
    {
        if(category == 0)
        {
            String[] names = getResources().getStringArray(R.array.SaladsName);
            String[] prices = getResources().getStringArray(R.array.SaladsPrices);
            TypedArray images = getResources().obtainTypedArray(R.array.SaladsImages);

            bigPicture.setImageResource(images.getResourceId(dishNumber, category));
            textTitle.setText(names[dishNumber]);
            textDescription.setText(prices[dishNumber]);
        }

        if(category == 1)
        {
            String[] names = getResources().getStringArray(R.array.SoupsName);
            String[] prices = getResources().getStringArray(R.array.SoupsPrices);
            TypedArray images = getResources().obtainTypedArray(R.array.SoupsImages);

            bigPicture.setImageResource(images.getResourceId(dishNumber, category));
            textTitle.setText(names[dishNumber]);
            textDescription.setText(prices[dishNumber]);
        }

        if(category == 2)
        {
            String[] names = getResources().getStringArray(R.array.HotDishesName);
            String[] prices = getResources().getStringArray(R.array.HotDishesPrices);
            TypedArray images = getResources().obtainTypedArray(R.array.HotDishesImages);

            bigPicture.setImageResource(images.getResourceId(dishNumber, category));
            textTitle.setText(names[dishNumber]);
            textDescription.setText(prices[dishNumber]);
        }

        if(category == 3)
        {
            String[] names = getResources().getStringArray(R.array.SecondDishesName);
            String[] prices = getResources().getStringArray(R.array.SecondDishesPrices);
            TypedArray images = getResources().obtainTypedArray(R.array.SecondDishesImages);

            bigPicture.setImageResource(images.getResourceId(dishNumber, category));
            textTitle.setText(names[dishNumber]);
            textDescription.setText(prices[dishNumber]);
        }

        if(category == 4)
        {
            String[] names = getResources().getStringArray(R.array.DrinksName);
            String[] prices = getResources().getStringArray(R.array.DrinksPrices);
            TypedArray images = getResources().obtainTypedArray(R.array.DrinksImages);

            bigPicture.setImageResource(images.getResourceId(dishNumber, category));
            textTitle.setText(names[dishNumber]);
            textDescription.setText(prices[dishNumber]);
        }

        if(category == 5)
        {
            String[] names = getResources().getStringArray(R.array.DessertsName);
            String[] prices = getResources().getStringArray(R.array.DessertsPrices);
            TypedArray images = getResources().obtainTypedArray(R.array.DessertsImages);

            bigPicture.setImageResource(images.getResourceId(dishNumber, category));
            textTitle.setText(names[dishNumber]);
            textDescription.setText(prices[dishNumber]);
        }

    }

    public FoodDescriptionFragment() {
    }
    public static FoodDescriptionFragment newInstance(String param1, String param2) {
        FoodDescriptionFragment fragment = new FoodDescriptionFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_food_description, container, false);
    }
}