package net.kdt.pojavlaunch;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.annotation.Nullable;

import git.artdeell.mojo.R;

/**
 * LunoClient splash screen.
 * Built on top of MojoLauncher's TestStorageActivity flow - shown first,
 * then routes to the ToS screen (first run only) or straight into the
 * normal storage-check flow.
 */
public class LunoSplashActivity extends Activity {

    public static final String LUNO_PREFS = "luno_onboarding";
    public static final String KEY_TOS_ACCEPTED = "tos_accepted";

    private static final int SPLASH_DELAY_MS = 1400;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luno_splash);

        new Handler(Looper.getMainLooper()).postDelayed(this::proceed, SPLASH_DELAY_MS);
    }

    private void proceed() {
        SharedPreferences prefs = getSharedPreferences(LUNO_PREFS, MODE_PRIVATE);
        boolean tosAccepted = prefs.getBoolean(KEY_TOS_ACCEPTED, false);

        Intent intent;
        if (!tosAccepted) {
            intent = new Intent(this, LunoTosActivity.class);
        } else {
            intent = new Intent(this, TestStorageActivity.class);
        }
        startActivity(intent);
        finish();
    }
}
