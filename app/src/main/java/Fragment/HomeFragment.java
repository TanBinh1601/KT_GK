package Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.foody.R;
import com.google.android.material.tabs.TabLayout;

import Adapter.PagerAdapter;

public class HomeFragment extends Fragment {
    View myFragment2;

    //    ViewPager viewPagertb;
//    TabLayout tabLayouttb;
    private ViewPager mviewPager2;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        myFragment2=inflater.inflate(R.layout.fragment_home,container,false);
        InitView2();
        return myFragment2;
    }
    private void InitView2() {
        mviewPager2= (ViewPager) myFragment2.findViewById(R.id.viewp);
        mviewPager2.setAdapter(new PagerAdapter(getChildFragmentManager())) ;
        TabLayout mtabLayout= (TabLayout) myFragment2.findViewById(R.id.tab);
        mtabLayout.setupWithViewPager(mviewPager2);
    }

}