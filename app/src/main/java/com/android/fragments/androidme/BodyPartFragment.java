package com.android.fragments.androidme;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.android.fragments.data.AndroidImageAssets;

/*
 ** Created by Gautam Krishnan {@link https://github.com/GautiKrish}
 */public class BodyPartFragment extends Fragment {

     public BodyPartFragment(){

     }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_body_part,container,false);
        ImageView imageView = rootView.findViewById(R.id.body_part_image_view);
        imageView.setImageResource(AndroidImageAssets.getHeads().get(0));
        return rootView;
    }
}
