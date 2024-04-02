package com.structural.composite;

public class CompositeApp {
    public static void main(String[] args) {
        Directory root = new Directory("/");
        Directory etc = new Directory("etc");
        Directory bin = new Directory("bin");
        Directory home = new Directory("home");
        Directory opt = new Directory("opt");

        root.addComponent(etc);
        root.addComponent(home);
        root.addComponent(opt);
        root.addComponent(bin);

        etc.addComponent(new File("hosts","localhost 127.0.0.1"));
        home.addComponent(new File("profile","export HOME='/home';"));

        traverseDirectory(root);

    }

    public static void traverseDirectory(Component component) {
            if (component instanceof File){
                System.out.print(component.getName());
                System.out.println("    " + ((File) component).cat());
            }
            else {
                System.out.println(component.getName());
                ((Directory) component).getSubComponents().forEach(CompositeApp::traverseDirectory);
            }
    }
}
