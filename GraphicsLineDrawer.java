package ru.vsu.cs.kg2020.g102.karaulova_n_a.line_drawers;

import ru.vsu.cs.kg2020.g102.karaulova_n_a.LineDrawer;

import java.awt.*;




public class GraphicsLineDrawer implements LineDrawer {
    private Graphics g;

    public GraphicsLineDrawer(Graphics g) {
        this.g = g;
    }

    @Override
    public void drawLine(int x1, int y1, int x2, int y2) {

    }
}