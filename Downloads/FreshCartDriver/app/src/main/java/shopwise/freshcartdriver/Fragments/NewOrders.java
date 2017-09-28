package shopwise.freshcartdriver.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import shopwise.freshcartdriver.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NewOrders extends Fragment {


    public NewOrders() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_new_orders, container, false);
    }

}
