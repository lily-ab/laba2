package com.lab2.Factory.AnimalFactory;

import com.lab2.Entity.Animals.*;

import java.util.HashMap;
import java.util.Map;

public class AnimalFactoryCreator {
    private Map<String, AnimalCreator> mapCreator = new HashMap<>();

    public AnimalFactoryCreator() {
        createFactory();
    }

    public void createFactory() {
        mapCreator.put("1", new BearCreator());
        mapCreator.put("2", new BirdCreator());
        mapCreator.put("3", new CrocodileCreator());
        mapCreator.put("4", new DolphinCreator());
        mapCreator.put("5", new ElephantCreator());
        mapCreator.put("6", new MonkeyCreator());
    }

    public Animal createAnimal(String key, String name, int gender) {
        AnimalCreator animal;
        if (mapCreator.containsKey(key)) {
            animal = mapCreator.get(key);
            return animal.create(name, gender);
        }
        return null;
    }
}

