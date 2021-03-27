package com.app.recyleviewhome.Home;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.app.recyleviewhome.R;
import com.app.recyleviewhome.ui.customAdapter;
import com.app.recyleviewhome.ui.modalClass;

import java.util.ArrayList;


public class universal_category extends Fragment {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    View v;
    ArrayList<modalClass> mlist;
    customAdapter customAdapterobj;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_universal_category, container, false);
        recyclerView = v.findViewById(R.id.recycleviewhome_universal);
        customAdapterobj = new customAdapter(mlist, getContext());
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        recyclerView.setAdapter(customAdapterobj);
        recyclerView.setHasFixedSize(true);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle saveInstaceState){
        super.onCreate(saveInstaceState);
        mlist = new ArrayList<>();
        mlist.add(new modalClass(R.drawable.bed1, R.string.bed1,R.string.bed2Desc,"bedRoom"));
        mlist.add(new modalClass(R.drawable.bed2, R.string.bed2,R.string.bed2Desc,"bedRoom"));
        mlist.add(new modalClass(R.drawable.bed3, R.string.bed3,R.string.bed2Desc,"bedRoom"));
        mlist.add(new modalClass(R.drawable.dp1, R.string.dp1, R.string.bed2Desc, "kitchen"));
        mlist.add(new modalClass(R.drawable.dp2, R.string.dp2,R.string.bed2Desc,"kitchen"));
        mlist.add(new modalClass(R.drawable.dp3, R.string.dp3,R.string.bed2Desc,"kitchen"));
        mlist.add(new modalClass(R.drawable.km1, R.string.km1,R.string.bed2Desc,"bathRoom"));
        mlist.add(new modalClass(R.drawable.km2, R.string.km2,R.string.bed2Desc,"bathRoom"));
        mlist.add(new modalClass(R.drawable.km3, R.string.km3,R.string.bed2Desc,"bathRoom"));
        mlist.add(new modalClass(R.drawable.liv1, R.string.liv1,R.string.bed2Desc,"livingRoom"));
        mlist.add(new modalClass(R.drawable.liv2, R.string.liv2,R.string.bed2Desc,"livingRoom"));
        mlist.add(new modalClass(R.drawable.liv3, R.string.liv3,R.string.bed2Desc,"livingRoom"));
    }

}

//    @Override
//    public void onCreate(@Nullable Bundle saveInstaceState){
//        super.onCreate(saveInstaceState);
//
//        mlist = new ArrayList<>();
//        mlist.add(new modalClass(R.drawable.bed1, R.string.bed1,0,"bedRoom"));
//        mlist.add(new modalClass(R.drawable.bed2, R.string.bed2,0,"bedRoom"));
//        mlist.add(new modalClass(R.drawable.bed3, R.string.bed3,0,"bedRoom"));
//        mlist.add(new modalClass(R.drawable.dp1, R.string.dp1, 0, "kitchen"));
//        mlist.add(new modalClass(R.drawable.dp2, R.string.dp2,0,"kitchen"));
//        mlist.add(new modalClass(R.drawable.dp3, R.string.dp3,0,"kitchen"));
//        mlist.add(new modalClass(R.drawable.km1, R.string.km1,0,"bathRoom"));
//        mlist.add(new modalClass(R.drawable.km2, R.string.km2,0,"bathRoom"));
//        mlist.add(new modalClass(R.drawable.km3, R.string.km3,0,"bathRoom"));
//        mlist.add(new modalClass(R.drawable.liv1, R.string.liv1,0,"livingRoom"));
//        mlist.add(new modalClass(R.drawable.liv2, R.string.liv2,0,"livingRoom"));
//        mlist.add(new modalClass(R.drawable.liv3, R.string.liv3,0,"livingRoom"));
//    }
