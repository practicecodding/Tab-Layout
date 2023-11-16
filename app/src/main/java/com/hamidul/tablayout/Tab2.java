package com.hamidul.tablayout;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class Tab2 extends Fragment {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    public boolean splash;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.fragment_tab2, container, false);


        sharedPreferences = getActivity().getSharedPreferences(getString(R.string.app_name), Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        editor.putBoolean("splash",true);
        editor.apply();


        return myView;
    }
}