package com.envoy.ui.autoresponder;

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
import com.envoy.databinding.AutoResponderFragmentBinding;
import com.envoy.databinding.FragmentGalleryBinding;
import com.envoy.ui.gallery.GalleryViewModel;

public class AutoResponderFragment extends Fragment {

    private AutoResponderViewModel mViewModel;
    private AutoResponderFragmentBinding binding;

    public static AutoResponderFragment newInstance() {
        return new AutoResponderFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mViewModel =
                new ViewModelProvider(this).get(AutoResponderViewModel.class);

        binding = AutoResponderFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textView3;
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
        mViewModel = new ViewModelProvider(this).get(AutoResponderViewModel.class);

        // TODO: Use the ViewModel
    }

}