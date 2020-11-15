package com.nghia.pvn.baicuoiky;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class F2 extends Fragment {
    private View view;
    private GridView list;
    String[] web =
            {
                    "2 Béo",
                    "Bắp Mễ",
                    "Bánh 9 Sạch",
                    "Biscotti",
            };
    String[] cs =
            {
                    "Bánh ngon vừa miệng",
                    "Ăn ngon ",
                    "Mới ăn thử, rất ngon",
                    "Rất tốt",
            };
    Integer[] imageId =
            {
                    R.drawable.b1,
                    R.drawable.b2,
                    R.drawable.b3,
                    R.drawable.b4,
            };

    @NonNull
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_blank2,container,false);

        CustomList adapter = new CustomList(getActivity(), web, cs, imageId);
        list =  view.findViewById(R.id.grid2);
        list.setAdapter(adapter);
        return view;
    }
}
