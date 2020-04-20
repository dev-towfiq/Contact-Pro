package com.towfiq.contactpro;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ContactFragment extends Fragment {
    private List<ContactModel> contactModels = new ArrayList<>();
    private RecyclerView recyclerView;

    public ContactFragment() {

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.contact_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.rvid);

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), contactModels);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerViewAdapter);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        contactModels.add(new ContactModel("Unknown", "01711431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Towfiq", "01521431210", R.drawable.towfiq));
        contactModels.add(new ContactModel("Abrar", "+880 1616-465609", R.drawable.abrar));
        contactModels.add(new ContactModel("Rizon", "+880 1676-663311", R.drawable.rizon));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
        contactModels.add(new ContactModel("Unknown", "+880 1711-431210", R.drawable.contact));
    }
}
