/**
 * Concrete Builder
 */
public class HouseBuilder implements Builder {
    private int walls;
    private int doors;
    private boolean hasPool;
    private boolean hasRoof;
    private String color;


    @Override
    public Builder buildRoof(boolean hasRoof) {
        this.hasRoof = hasRoof;
        return this;
    }

    @Override
    public Builder buildPool(boolean hasPoof) {
        this.hasPool = hasPoof;
        return this;
    }

    @Override
    public Builder buildWalls(int walls) {
        this.walls = walls;
        return this;
    }

    @Override
    public Builder buildDoor(int doors) {
        this.doors = doors;
        return this;
    }

    @Override
    public Builder buildColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public House build() {
        return new House(walls,doors,hasPool,hasRoof,color);
    }

}
