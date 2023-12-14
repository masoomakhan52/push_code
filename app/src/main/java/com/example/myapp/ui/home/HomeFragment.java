package com.example.myapp.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapp.MainActivity;
import com.example.myapp.R;
import com.example.myapp.databinding.FragmentHomeBinding;
import com.example.myapp.loginActivity;
import com.example.myapp.R;
import com.example.myapp.databinding.FragmentHomeBinding;
import com.github.hamzaahmedkhan.counteranimationtextview.CountAnimationTextView;
import com.google.android.material.button.MaterialButton;
import com.shuhart.stepview.StepView;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    CountAnimationTextView counter;
    StepView stepView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();



        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}