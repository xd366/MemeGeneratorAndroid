package xd366productions.memegenerator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.support.v4.app.Fragment;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;




public class TopSectionFragment extends Fragment{

    private static EditText topTextInput;
    private static EditText BottomTextInput;

    TopSectionListner activityCommander;
    public interface TopSectionListner{

        public void createMeme(String top, String bottom);
    }


    public void onAttatch(Activity activity){
        super.onAttach(activity);
        try {
            activityCommander = (TopSectionListner) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString());
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.topsectionfragment, container, false);

        topTextInput = (EditText) view.findViewById(R.id.TopMemeText);
        BottomTextInput = (EditText) view.findViewById(R.id.BottomMemeText);
        final Button button = (Button) view.findViewById(R.id.button);


        button.setOnClickListener(
                new View.OnClickListener(){
                        public void onClick(View v){
                            buttonClicked(v);
                        }
                }
        );

        return view;

    }
public void buttonClicked (View view){
activityCommander.createMeme(topTextInput.getText().toString(), BottomTextInput.getText().toString());

}
}
