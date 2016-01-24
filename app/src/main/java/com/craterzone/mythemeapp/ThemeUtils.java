package com.craterzone.mythemeapp;

import android.app.Activity;

/**
 * Created by craterzone on 4/12/15.
 */
public class ThemeUtils {
    private static int sTheme;


    /**
     * Set the theme of the Activity, and restart it by creating a new Activity
     * of the same type.
     */
    public static void changeToTheme(Activity activity, int theme) {
        sTheme = theme;
    }

    /**
     * Set the theme of the activity, according to the configuration.
     */
    public static void onActivityCreateSetTheme(String theme, Activity activity) {
        switch (theme) {
            case ConstantUtill.THEME_BLUE:
                activity.setTheme(R.style.BlueTheme);
                break;
            case ConstantUtill.THEME_GREEN:
                activity.setTheme(R.style.GreenTheme);
                break;
            case ConstantUtill.THEME_DARK_GREEN:
                activity.setTheme(R.style.DarkGreenTheme);
                break;
            case ConstantUtill.THEME_SEA_GREEN:
                activity.setTheme(R.style.SeaGreenTheme);
                break;
            default:
                activity.setTheme(R.style.BlueTheme);
                break;
        }
    }


}
