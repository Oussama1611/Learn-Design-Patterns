package com.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Component{
    private List<Component> subComponents;

    public Directory(String name) {
        super(name);
        subComponents = new ArrayList<>();
    }

    public void addComponent(Component component) {
        subComponents.add(component);
    }

    public List<Component> getSubComponents() {
        return subComponents;
    }
}
