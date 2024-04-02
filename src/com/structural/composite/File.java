package com.structural.composite;

public class File extends Component{
    private String content;

    public File(String name, String content) {
        super(name);
        this.content = content;
    }

    public String cat() {
        return content;
    }
}
