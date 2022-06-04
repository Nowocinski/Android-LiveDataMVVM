package com.example.livedatamvvm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.livedatamvvm.databinding.Fragment2Binding;

public class Fragment2 extends Fragment {
    private FragmentViewModel viewModel;
    private Fragment2Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        this.binding = Fragment2Binding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
        //return inflater.inflate(R.layout.fragment_2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.viewModel = new ViewModelProvider(getActivity()).get(FragmentViewModel.class);

        this.viewModel.getString()
                //.observe(getViewLifecycleOwner(), textView::setText);
                .observe(getViewLifecycleOwner(), s -> {
                    binding.textView.setText(s);
                });
    }
}