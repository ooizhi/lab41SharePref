package my.edu.tarc.lab41sharepref;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class importFragment extends Fragment {
    private TextView textViewMessage;

    public importFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view;
        view = inflater.inflate(R.layout.fragment_import, container, false);
        //view = refers to the layout of ImportFragment
        textViewMessage = view.findViewById(R.id.textViewMessage);

        Button buttonShowMessage;
        buttonShowMessage = view.findViewById(R.id.buttonShowMessage);
        buttonShowMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewMessage.setText("Hello Import Fragment");
            }
        });

        return view;
    }

}
