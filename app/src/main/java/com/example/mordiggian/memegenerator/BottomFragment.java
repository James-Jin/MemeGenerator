package com.example.mordiggian.memegenerator;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottomFragment extends Fragment {
    private static TextView topText;
    private static TextView bottomText;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_fragment,container,false);
        topText = (TextView)view.findViewById(R.id.textView);
        bottomText = (TextView)view.findViewById(R.id.textView2);

        return view;

    }

    public void setMemeText(String topString, String bottomString){
        topText.setText(topString);
        bottomText.setText(bottomString);
    }
}
