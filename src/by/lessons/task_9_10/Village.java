package by.lessons.task_9_10;

public class Village {
    private Building[] buildings = new Building[1];

    public void addBuilding(Building building) {

        int count = 0;
        for (int i = 0; i < buildings.length; i++) {
            count++;
        }

        Building[] newBuildings = new Building[count + 1];
        for (int i = 0; i < count; i++) {
            newBuildings[i] = buildings[i];
        }
        newBuildings[count] = building;
        buildings = newBuildings;

    }

    public void info() {
        for (Building building : buildings) {
            if (building != null) {
                System.out.println(building.info());
            }
        }
    }
}
