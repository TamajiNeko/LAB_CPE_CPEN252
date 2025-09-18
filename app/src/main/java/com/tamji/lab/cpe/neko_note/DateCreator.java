package com.tamji.lab.cpe.neko_note;

import android.annotation.SuppressLint;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateCreator {
    @SuppressLint("ConstantLocale")
    private static final SimpleDateFormat shortFormat =
            new SimpleDateFormat("d/M/yy", Locale.getDefault());

    public static String format(Date date) {
        if (date == null) return "Unknown date";
        return shortFormat.format(date);
    }
}
