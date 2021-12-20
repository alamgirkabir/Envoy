package com.envoy.ui.ussd;

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
import com.envoy.databinding.TemplateFragmentBinding;
import com.envoy.databinding.UssdFragmentBinding;
import com.envoy.ui.template.TemplateViewModel;

public class UssdFragment extends Fragment {

    private UssdViewModel mViewModel;
    private UssdFragmentBinding binding;

    public static UssdFragment newInstance() {
        return new UssdFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mViewModel =
                new ViewModelProvider(this).get(UssdViewModel.class);

        binding = UssdFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textView10;
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
        mViewModel = new ViewModelProvider(this).get(UssdViewModel.class);
        // TODO: Use the ViewModel
    }

}