package ru.vsu.cs.kg2020.g102.karaulova_n_a.utils;

import ru.vsu.cs.kg2020.g102.karaulova_n_a.LineDrawer;

import java.awt.*;

public class DrawUtils {
    public static void drawSnowflake(LineDrawer g,
                                     int x, int y, int r, int n) {
        double da = 2 * Math.PI / n;
        for (int i = 0; i < n; i++) {
            double dx = r * Math.cos(da * i);
            double dy = r * Math.sin(da * i);
            g.drawLine(x, y, x+(int)dx, y+(int)dy );
        }
    }
}