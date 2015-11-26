package com.example.mordiggian.memegenerator;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Button;
import android.app.Activity;

public class TopFragment extends Fragment{
    private static EditText topTextInput;
    private static EditText bottomTextInput;

    TopFragmentListener activityCommander;

    public interface TopFragmentListener{
        public void generateMeme(String topString,String bottomString);
    };

    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);
        try{
            activityCommander = (TopFragmentListener) activity;

        }catch(ClassCastException e){
            throw new ClassCastException(activity.toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_fragment,container,false);
        topTextInput = (EditText)view.findViewById(R.id.TopInput);
        bottomTextInput = (EditText)view.findViewById(R.id.BottomInput);
        final Button button = (Button)view.findViewById((R.id.MyButton));

        button.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        buttonClicked(v);
                    }
                }
        );


        return view;

    }

    //called when user click button
    public void buttonClicked(View v){
        activityCommander.generateMeme(topTextInput.getText().toString(),bottomTextInput.getText().toString());
    }
}
