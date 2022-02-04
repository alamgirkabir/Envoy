package com.envoy.ui.device;

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
import com.envoy.databinding.DashboardFragmentBinding;
import com.envoy.databinding.DeviceFragmentBinding;
import com.envoy.ui.dashboard.DashboardViewModel;

public class DeviceFragment extends Fragment {

    private DeviceViewModel mViewModel;
    private DeviceFragmentBinding binding;

    public static DeviceFragment newInstance() {
        return new DeviceFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mViewModel =
                new ViewModelProvider(this).get(DeviceViewModel.class);

        binding = DeviceFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textViewDevice;
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
        mViewModel = new ViewModelProvider(this).get(DeviceViewModel.class);
        // TODO: Use the ViewModel
    }

}