package com.envoy.ui.template;

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
import com.envoy.databinding.SenderFragmentBinding;
import com.envoy.databinding.TemplateFragmentBinding;
import com.envoy.ui.sender.SenderViewModel;

public class TemplateFragment extends Fragment {

    private TemplateViewModel mViewModel;
    private TemplateFragmentBinding binding;

    public static TemplateFragment newInstance() {
        return new TemplateFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mViewModel =
                new ViewModelProvider(this).get(TemplateViewModel.class);

        binding = TemplateFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textViewTemplateTitle;
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
        mViewModel = new ViewModelProvider(this).get(TemplateViewModel.class);
        // TODO: Use the ViewModel
    }

}