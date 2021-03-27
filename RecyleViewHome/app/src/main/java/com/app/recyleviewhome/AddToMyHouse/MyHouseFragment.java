package com.app.recyleviewhome.AddToMyHouse;

import android.app.Fragment;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.app.recyleviewhome.PassingData.DataApps;
import com.app.recyleviewhome.R;
import com.app.recyleviewhome.ui.modalClass;

public class MyHouseFragment extends Fragment {

    modalClass[] room = DataApps.getInstance().add;

    ImageView bedRoom;
    ImageView bathRoom;
    ImageView kitchen;
    ImageView livingRoom;

    public MyHouseFragment() {
        // Required empty public constructor

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_myhouse, container, false);
        bedRoom = v.findViewById(R.id.imageView3_myHouse);
        bathRoom = v.findViewById(R.id.imageView2_myHouse);
        kitchen = v.findViewById(R.id.imageView4_myHouse);
        livingRoom = v.findViewById(R.id.imageView1_myHouse);

        return v;
    }

}

//package com.app.recyleviewhome;
//
//        import android.os.Bundle;
//
//        import androidx.fragment.app.Fragment;
//
//        import android.view.LayoutInflater;
//        import android.view.View;
//        import android.view.ViewGroup;
//        import android.widget.ImageView;
//
//        import com.app.recyleviewhome.ui.modalClass;
//
//public class MyHouseFragment extends Fragment {
//
//    modalClass[] room = DataApps.getInstance().add;
//
//    ImageView bedRoom;
//    ImageView bathRoom;
//    ImageView kitchen;
//    ImageView livingRoom;
//
//
////    bedRoom.setResources(room[0].getImage);
////    bathRom.setResources(room[1].getImage);
//
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    private String mParam1;
//    private String mParam2;
//
//    public MyHouseFragment() {
//        // Required empty public constructor
//
//    }
//
//    public static MyHouseFragment newInstance(String param1, String param2) {
//        MyHouseFragment fragment = new MyHouseFragment();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//
//        return fragment;
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//
////
////        if(room[0]!=null)bedRoom.setImageResource(room[0].getImage());
////        if(room[1]!=null)bedRoom.setImageResource(room[1].getImage());
////        if(room[2]!=null)bedRoom.setImageResource(room[2].getImage());
////        if(room[3]!=null)bedRoom.setImageResource(room[3].getImage());
////
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//
//        // Inflate the layout for this fragment
//        View v = inflater.inflate(R.layout.fragment_myhouse, container, false);
//
//        bedRoom = v.findViewById(R.id.imageView3);
//        bathRoom = v.findViewById(R.id.imageView4);
//        kitchen = v.findViewById(R.id.imageView2);
//        livingRoom = v.findViewById(R.id.imageView1);
//
//        if(room[0]!=null)bedRoom.setImageResource(room[0].getImage());
//        if(room[1]!=null)bathRoom.setImageResource(room[1].getImage());
//        if(room[2]!=null)kitchen.setImageResource(room[2].getImage());
//        if(room[3]!=null)livingRoom.setImageResource(room[3].getImage());
//        return  v;
//    }
//}