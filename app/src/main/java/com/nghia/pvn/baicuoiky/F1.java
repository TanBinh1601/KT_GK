package com.nghia.pvn.baicuoiky;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.GridView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class F1 extends Fragment {

    private View view;
    private GridView list;
    String[] web =
            {
                    "Thành Mập",
                    "Ngỏ 8",
                    "A Xìn",
                    "Nhà Hàng Parsley",
            };
    String[] cs =
            {
                    "Ngon lắm nhaaa shop",
                    "Ăn ngon nhưng khá ồn",
                    "Ngon",
                    "Rất tốt",
            };
    Integer[] imageId =
            {
                    R.drawable.a1,
                    R.drawable.a2,
                    R.drawable.a3,
                    R.drawable.a4,
            };

    @NonNull
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_blank1,container,false);

        CustomList adapter = new CustomList(getActivity(), web, cs, imageId);
        list =  view.findViewById(R.id.grid1);
        list.setAdapter(adapter);
        return view;
    }

}
