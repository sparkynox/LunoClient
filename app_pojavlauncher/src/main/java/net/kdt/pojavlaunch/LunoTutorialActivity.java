package net.kdt.pojavlaunch;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;

import git.artdeell.mojo.R;

public class LunoTutorialActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luno_tutorial);

        Button finishButton = findViewById(R.id.luno_tutorial_finish);
        finishButton.setOnClickListener(v -> {
            // mark onboarding fully done, in case we want to gate on it separately later
            SharedPreferences prefs = getSharedPreferences(LunoSplashActivity.LUNO_PREFS, MODE_PRIVATE);
            prefs.edit().putBoolean("onboarding_complete", true).apply();

            startActivity(new Intent(this, TestStorageActivity.class));
            finish();
        });
    }
}
