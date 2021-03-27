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


public class furniture_category_fix extends Fragment {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    View v;
    ArrayList<modalClass> mlist;
    customAdapter customAdapterobj;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_funiture_category_fix, container, false);
        recyclerView = v.findViewById(R.id.recycleviewhome_funi);
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
//        mlist.add(new modalClass(R.drawable.bed1, R.string.bed1, "bedroom"));
//        mlist.add(new modalClass(R.drawable.bed2, R.string.bed2, "bedroom"));
//        mlist.add(new modalClass(R.drawable.bed3, R.string.bed3, "bedroom"));
//        mlist.add(new modalClass(R.drawable.dp1, R.string.dp1, "Kitchen"));
//        mlist.add(new modalClass(R.drawable.dp2, R.string.dp2));
//        mlist.add(new modalClass(R.drawable.dp3, R.string.dp3));
//        mlist.add(new modalClass(R.drawable.km1, R.string.km1));
//        mlist.add(new modalClass(R.drawable.km2, R.string.km2));
//        mlist.add(new modalClass(R.drawable.km3, R.string.km3));
//        mlist.add(new modalClass(R.drawable.liv1, R.string.liv1));
//        mlist.add(new modalClass(R.drawable.liv2, R.string.liv2));
//        mlist.add(new modalClass(R.drawable.liv3, R.string.liv3));
//        mlist.add(new modalClass(R.drawable.kasur1, R.string.kasur1));
//        mlist.add(new modalClass(R.drawable.kasur2, R.string.kasur2));
//        mlist.add(new modalClass(R.drawable.kasur3, R.string.kasur3));
//        mlist.add(new modalClass(R.drawable.chair1, R.string.chair1));
//        mlist.add(new modalClass(R.drawable.chair2, R.string.chair2));
//        mlist.add(new modalClass(R.drawable.chair3, R.string.chair3));
//        mlist.add(new modalClass(R.drawable.meja1, R.string.table1));
//        mlist.add(new modalClass(R.drawable.meja2, R.string.table2));
//        mlist.add(new modalClass(R.drawable.meja3, R.string.table3));
        mlist.add(new modalClass(R.drawable.lamp1, R.string.lamp1,R.string.bed2Desc,"lamp"));
//        mlist.add(new modalClass(R.drawable.lamp2, R.string.lamp2));
//        mlist.add(new modalClass(R.drawable.lamp3, R.string.lamp3));
    }

}