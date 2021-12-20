package com.envoy.ui.sender;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.envoy.R;
import com.envoy.databinding.ProfileFragmentBinding;
import com.envoy.databinding.SenderFragmentBinding;
import com.envoy.ui.profile.ProfileViewModel;

public class SenderFragment extends Fragment {

    private SenderViewModel mViewModel;
    private SenderFragmentBinding binding;

    public static SenderFragment newInstance() {
        return new SenderFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mViewModel =
                new ViewModelProvider(this).get(SenderViewModel.class);

        binding = SenderFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textView8;
        mViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(SenderViewModel.class);
        // TODO: Use the ViewModel
    }

}