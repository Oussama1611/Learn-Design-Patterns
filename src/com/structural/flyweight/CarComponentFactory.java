package com.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CarComponentFactory {
    private static final Map<String, CarComponent> engineMap = new HashMap<>();
    private static final Map<String, CarComponent> wheelMap = new HashMap<>();

    public static CarComponent getEngine(String type) {
        return engineMap.computeIfAbsent(type, Engine::new);
    }

    public static CarComponent getWheel(String design) {
        return wheelMap.computeIfAbsent(design, Wheel::new);
    }
}