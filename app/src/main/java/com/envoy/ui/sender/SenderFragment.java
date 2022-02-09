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
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
import android.widget.TextView;

import com.envoy.R;
import com.envoy.databinding.ProfileFragmentBinding;
import com.envoy.databinding.SenderFragmentBinding;
import com.envoy.ui.profile.ProfileViewModel;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;

import java.util.ArrayList;
import java.util.List;

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

        final TextView textView = binding.textViewSenderTitle;
        final MaterialAutoCompleteTextView spinnerDeviceNames = binding.textInputDeviceNames;
        final MaterialAutoCompleteTextView spinnerPrioritize = binding.spinnerPrioritize;

        /**
         * Data adapter for spinner device names
         */
        List<String> categories = new ArrayList<>();
        categories.add("Automobile");
        categories.add("Business Services");
        categories.add("Computers");
        categories.add("Education");
        categories.add("Personal");
        categories.add("Travel");

        ArrayAdapter<String> spinnerDeviceNamesDataAdapter = new ArrayAdapter<String>(this.getContext(), android.R.layout.simple_spinner_item, categories);
        spinnerDeviceNames.setAdapter(spinnerDeviceNamesDataAdapter);
        /**
         * Device names data end
         */

        /**
         * Data adapter for spinner prioritize
         */
        List<String> prioritizeFlagItems = new ArrayList<>();
        prioritizeFlagItems.add("Yes");
        prioritizeFlagItems.add("No");

        ArrayAdapter<String> spinnerPrioritizeDataAdapter = new ArrayAdapter<String>(this.getContext(), android.R.layout.simple_spinner_item, prioritizeFlagItems);
        spinnerPrioritize.setAdapter(spinnerPrioritizeDataAdapter);
        /**
         * Device names data end
         */
        /**
         * Data adapter for Spinner deviceName
         */
        List<String>deviceFlagItems = new ArrayList<>();
        deviceFlagItems.add("Handset Name1");
        deviceFlagItems.add("Handset Name2");

        /**
         * Device names data end write code after validating array part
         */

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
