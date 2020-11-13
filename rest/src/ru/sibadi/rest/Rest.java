package ru.sibadi.rest;

public class Rest {
    private final String name;
    private final Food[] menu;
    private final Table[] tables;

    public Rest() {
        this.name = "Happiness";
        this.menu = new Food[]{
                new Food("Baked fish", 250.5),
                new Food("Paste", 200.5),
                new Food("Salad", 150.00),
                new Food("Cherry pie", 100.00),
		new Food("Tea", 30.00)
        };
        this.tables = new Table[]{
                new Table("1",100.0),
                new Table("2", 150.0),
                new Table("3", 200.0),
		new Table("4", 250.0),
		new Table("5", 300.0)
        };
    }

    public String getName() {
        return name;
    }

    public Food[] getMenu() {
        return menu;
    }

    public Table[] getTables() {
        return tables;
    }
}
