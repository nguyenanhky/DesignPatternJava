/**
 * Builder
 */
public interface Builder {
    Builder buildRoof(boolean hasRoof);
    Builder buildPool(boolean hasPoof);
    Builder buildWalls(int walls);
    Builder buildDoor(int doors);
    Builder buildColor(String color);
    House build();
}
