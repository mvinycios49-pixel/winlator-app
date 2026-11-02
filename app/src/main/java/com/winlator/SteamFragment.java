package com.winlator;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SteamFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull android.view.LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        LinearLayout layout = new LinearLayout(requireContext());
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(32, 32, 32, 32);

        TextView title = new TextView(requireContext());
        title.setText("Steam");
        title.setTextSize(28);
        title.setGravity(Gravity.CENTER);

        TextView description = new TextView(requireContext());
        description.setText(
            "Steam integration is being developed.\n\n" +
            "The goal is to connect your account, display your game library " +
            "and manage the Wine environment automatically."
        );
        description.setTextSize(16);
        description.setGravity(Gravity.CENTER);
        description.setPadding(0, 24, 0, 0);

        layout.addView(title);
        layout.addView(description);

        return layout;
    }
}
