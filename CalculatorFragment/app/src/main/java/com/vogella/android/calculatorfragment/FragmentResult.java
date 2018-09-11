package com.vogella.android.calculatorfragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


@SuppressLint("ValidFragment")
public class FragmentResult extends Fragment {


    public  String result;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
     return  inflater.inflate(R.layout.fragment_result, null);
    }

    @SuppressLint("ValidFragment")
    public FragmentResult (String result)
    {
        this.result = result;
    }

    @Override
    public void onResume() {
        super.onResume();
        TextView textView = (TextView)getActivity().findViewById(R.id.resultField);
        textView.setText(result);
    }
}
