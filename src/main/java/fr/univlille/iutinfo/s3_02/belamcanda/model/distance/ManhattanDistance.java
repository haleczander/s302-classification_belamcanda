package fr.univlille.iutinfo.s3_02.belamcanda.model.distance;

import fr.univlille.iutinfo.s3_02.belamcanda.model.Column;
import fr.univlille.iutinfo.s3_02.belamcanda.model.Point;

import java.util.List;

public class ManhattanDistance implements Distance {
    public double distance(List<Column> columns, Point p1, Point p2) {
        double sum = 0;
        for (Column column: columns) {
            sum += column.compare(p1, p2);
        }
        return sum;
    }
}
