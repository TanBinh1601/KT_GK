package com.example.foody;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;


public class F1 extends Fragment {

    GridView list;
    GridViewAdapter adapter;
    ArrayList<ListViewBean_1> arr_bean;
    @NonNull
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_blank1,container,false);

        list = (GridView) v.findViewById(R.id.grid1);
        arr_bean = new ArrayList<ListViewBean_1>();
        arr_bean.add(new ListViewBean_1(R.drawable.a1,"Thành Mập", "Ngon lắm nha shop"));
        arr_bean.add(new ListViewBean_1(R.drawable.a2,"Ngõ 8", "Ăn ngon nhưng khá ồn"));
        arr_bean.add(new ListViewBean_1(R.drawable.a3,"A Xìn", "Ngon"));
        arr_bean.add(new ListViewBean_1(R.drawable.a4,"Nhà Hàng Parsley", "Rất tốt"));
        adapter = new GridViewAdapter(getActivity(), R.id.grid1, arr_bean) {
            @Override
            public long getItemId(int i) {
                return 0;
            }
        };
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getContext(), ProducDetail.class);
                intent.putExtra("name",arr_bean.get(i).getLangTitle());
                intent.putExtra("image",arr_bean.get(i).getImage());
                startActivity(intent);
            }
        });
        return v;
    }
}
