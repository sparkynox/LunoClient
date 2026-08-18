package net.kdt.pojavlaunch;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.Nullable;

import git.artdeell.mojo.R;

public class LunoTosActivity extends Activity {

    private static final String TOS_TEXT =
        "LunoClient - Terms of Service\n\n" +

        "1. What this app is\n" +
        "LunoClient is a Minecraft: Java Edition launcher for Android, built on top of the " +
        "MojoLauncher source code (itself based on PojavLauncher). LunoClient adds a custom " +
        "anime-themed interface, additional features, and optimization changes on top of that base.\n\n" +

        "2. Credit & Licensing\n" +
        "MojoLauncher and PojavLauncher are licensed under the GNU Lesser General Public License " +
        "v3 (LGPLv3). Full credit goes to the original MojoLauncher and PojavLauncher authors and " +
        "contributors - this app would not exist without their work. LunoClient keeps the original " +
        "license and copyright notices intact, and any modified files are marked as changed, as " +
        "required by the LGPLv3. The full license text is included with this app and is also " +
        "available from the MojoLauncher and PojavLauncher project pages.\n\n" +

        "3. Modifying this app\n" +
        "Because of the LGPLv3 license, you're free to modify LunoClient's source code yourself " +
        "(available on GitHub). If you redistribute a modified build, the LGPLv3 requires you to " +
        "also make your changes' source code available and keep the original credits and license " +
        "notices intact.\n\n" +

        "4. Third-party redistribution\n" +
        "You may not upload or redistribute unmodified or rebranded copies of LunoClient under " +
        "the SparkyNox name/branding on third-party app stores or websites without permission. " +
        "If you fork or modify the app, don't present your build as an official SparkyNox release.\n\n" +

        "5. Hacked clients & mods\n" +
        "LunoClient does not officially support or endorse Minecraft hack clients (e.g. Wurst) or " +
        "any client-side cheats. You're welcome to install whatever mods, jars, or hack clients you " +
        "want on top of LunoClient, but doing so - and any consequences that come with it (server " +
        "bans, account actions, etc.) - is entirely your own responsibility.\n\n" +

        "6. No warranty\n" +
        "LunoClient is provided \"as is\", without warranty of any kind, express or implied, to the " +
        "maximum extent permitted by law. The developer is not responsible for data loss, world " +
        "corruption, account issues, or any other damages resulting from the use of this app.\n\n" +

        "7. Minecraft & Mojang\n" +
        "LunoClient is not affiliated with, endorsed by, or associated with Mojang Studios, " +
        "Microsoft, or Minecraft in any way. You are responsible for owning a legitimate copy of " +
        "Minecraft: Java Edition where required.\n\n" +

        "8. Permissions & data\n" +
        "LunoClient requests storage and notification permissions solely to manage game files, " +
        "downloads, and instances on your device. LunoClient does not collect or sell your personal " +
        "data.\n\n" +

        "9. Changes to these terms\n" +
        "These terms may be updated in future versions of the app. Continued use of LunoClient " +
        "after an update means you accept the revised terms.\n\n" +

        "By tapping \"Accept & Continue\" below, you confirm that you've read and agree to these terms.";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luno_tos);

        TextView tosText = findViewById(R.id.luno_tos_text);
        tosText.setText(TOS_TEXT);

        CheckBox checkBox = findViewById(R.id.luno_tos_checkbox);
        Button acceptButton = findViewById(R.id.luno_tos_accept);
        Button declineButton = findViewById(R.id.luno_tos_decline);

        checkBox.setOnCheckedChangeListener((buttonView, isChecked) -> acceptButton.setEnabled(isChecked));

        acceptButton.setOnClickListener(v -> {
            SharedPreferences prefs = getSharedPreferences(LunoSplashActivity.LUNO_PREFS, MODE_PRIVATE);
            prefs.edit().putBoolean(LunoSplashActivity.KEY_TOS_ACCEPTED, true).apply();
            startActivity(new Intent(this, LunoWelcomeActivity.class));
            finish();
        });

        declineButton.setOnClickListener(v -> finishAffinity());
    }
}
