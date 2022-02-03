package com.company;
import java.util.Objects;

public class Coordinates {
    final int x;
    final int y;
    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Coordinates coordinate = (Coordinates) obj;
        return x == coordinate.x && y == coordinate.y;
    }
    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
