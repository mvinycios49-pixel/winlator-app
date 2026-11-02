package com.winlator;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SteamFragment extends Fragment {
    @Nullable
    @Override
    public android.view.View onCreateView(@NonNull android.view.LayoutInflater inflater,
            @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        LinearLayout layout = new LinearLayout(requireContext());
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(32, 32, 32, 32);

        TextView title = new TextView(requireContext());
        title.setText("Steam");
        title.setTextSize(30);
        title.setGravity(Gravity.CENTER);

        TextView description = new TextView(requireContext());
        description.setText("Conecte sua conta Steam ao Winlator Postal Edition.\n\nSua biblioteca pública poderá ser exibida aqui.");
        description.setTextSize(16);
        description.setGravity(Gravity.CENTER);

        Button button = new Button(requireContext());
        button.setText("Conectar à Steam");
        button.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://proud-block-0aff.mvinycios49.workers.dev/login"));
            startActivity(intent);
        });

        TextView status = new TextView(requireContext());
        status.setText("Integração em desenvolvimento. O retorno automático ainda será implementado.");
        status.setGravity(Gravity.CENTER);

        layout.addView(title);
        layout.addView(description);
        layout.addView(button);
        layout.addView(status);
        return layout;
    }
}
