package by.lessons.task_9_10;

public class IndustrialBuilding extends Building{
  private String branch;

    public IndustrialBuilding(String street, String material, int year, String branch) {
        super(street, material, year);
        this.branch = branch;
    }

    public String getBranch() {
      return branch;
  }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String info() {
        String info = " отрасль: " + branch + super.info();
        return info;
    }

}
