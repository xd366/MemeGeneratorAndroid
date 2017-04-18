package xd366productions.memegenerator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.support.v4.app.Fragment;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottomSectionFragment extends Fragment{

    private static TextView TopMemeText;
    private static TextView BottomMemeText;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.bottompicturefragment, container, false);
        TopMemeText =(TextView) view.findViewById(R.id.TopMemeText);
        BottomMemeText =(TextView)view.findViewById(R.id.BottomMemeText);

        return view;

    }

    public void SetMemeText(String top, String bottom){
        TopMemeText.setText(top);
        BottomMemeText.setText(bottom);

    }

}
