package net.kdt.pojavlaunch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;

import git.artdeell.mojo.R;

public class LunoWelcomeActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luno_welcome);

        Button nextButton = findViewById(R.id.luno_welcome_next);
        nextButton.setOnClickListener(v -> {
            startActivity(new Intent(this, LunoTutorialActivity.class));
            finish();
        });
    }
}
