package org.example;

import java.util.List;

public class Restro {
    private String restro_id;
    private String restro_name;

    private List<Dish> menu;

    private Location location;

    public String getRestro_id()
    {
        return restro_id;
    }

    public void setRestro_id(String restro_id)
    {
        this.restro_id = restro_id;
    }

    public String getRestro_name()
    {
        return restro_name;
    }

    public void setRestro_name(String restro_name)
    {
        this.restro_name = restro_name;
    }

    public List<Dish> getMenu() {
        return menu;
    }

    public void setMenu(List<Dish> menu) {
        this.menu = menu;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
