package io.romo.leaguedirectory.summonerspells;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

import io.romo.leaguedirectory.R;
import io.romo.leaguedirectory.util.ActivityUtils;

public class SummonerSpellsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summoner_spells);

        SummonerSpellsFragment summonerSpellsFragment =
                (SummonerSpellsFragment) getSupportFragmentManager().findFragmentById(R.id.summoner_spells_container);
        if (summonerSpellsFragment == null) {
            summonerSpellsFragment = new SummonerSpellsFragment();
            ActivityUtils.addFragmentToActivity(
                    getSupportFragmentManager(), summonerSpellsFragment, R.id.summoner_spells_container);
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            setupOverviewDescription();
        }
    }

    @TargetApi(21)
    private void setupOverviewDescription() {
        Bitmap overviewIcon = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher_overview);
        setTaskDescription(new ActivityManager.TaskDescription(getString(R.string.app_name),
                overviewIcon,
                ContextCompat.getColor(this, R.color.colorPrimary)));
        overviewIcon.recycle();
    }
}
