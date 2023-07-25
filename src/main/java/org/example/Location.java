package org.example;

public class Location {
    private int Lat;
    private  int longi;

    private  String restroId;

    public int getLat()
    {
        return Lat;
    }

    public void setLat(int lat)
    {
        Lat = lat;
    }

    public int getLongi()
    {
        return longi;
    }

    public void setLongi(int longi)
    {
        this.longi = longi;
    }

    public String getRestroId() {
        return restroId;
    }

    public void setRestroId(String restroId) {
        this.restroId = restroId;
    }
}
