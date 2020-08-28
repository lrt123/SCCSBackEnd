package cn.edu.guet.model;

import java.util.List;

public class Options {
    private String label;
    private String value;
    private List<Options> children;

    public List<Options> getChildren() {
        return children;
    }

    public void setChildren(List<Options> children) {
        this.children = children;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
