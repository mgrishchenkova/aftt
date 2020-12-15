package lesson12.task1.application;

import lesson12.task1.model.Generatable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class House implements Generatable {
  private List<Flat> flats;

    public House(List<Flat> flats) {
        this.flats = flats;
    }
    public House(){

    }

    public List<Flat> getFlats() {
        return flats;
    }

    @Override
    public Generatable generate() {
        this.flats= Arrays.asList(new Flat(),new Flat(),new Flat());
        this.flats=new ArrayList<>();
        flats.add(new Flat());
        flats.add(new Flat());
        flats.add(new Flat());
        flats.add(new Flat());
        flats.add(new Flat());
        return this;
    }
}
