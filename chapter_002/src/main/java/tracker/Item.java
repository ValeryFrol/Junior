package tracker;

public class Item {
    private String name;
    private String iD;
    private String description;

    public Item(String name, String iD, String description) {
        this.name = name;
        this.iD = iD;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getDescription() {
        return description;
    }
}
