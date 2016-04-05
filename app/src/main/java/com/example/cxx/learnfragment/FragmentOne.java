package com.example.cxx.learnfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentOne extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_layout1,container,false);
        rootView.findViewById(R.id.btnshow).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction()
                        .addToBackStack(null)//添加到后退栈，支持返回键
                        .replace(R.id.contain,new FragmentTwo())
                        .commit();
            }
        });
        return rootView;
    }
}
