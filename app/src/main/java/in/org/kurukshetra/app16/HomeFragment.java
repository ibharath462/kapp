package in.org.kurukshetra.app16;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

      //  Bundle args = getArguments();
       // RecyclerView recyclerView = new RecyclerView(getActivity());
      //  recyclerView.setAdapter(new HomeAdapter(getActivity()));
      //  recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return inflater.inflate(R.layout.home_menu, container, false);
    }

}
