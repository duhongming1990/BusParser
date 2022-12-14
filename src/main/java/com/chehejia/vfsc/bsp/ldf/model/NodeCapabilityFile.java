package com.chehejia.vfsc.bsp.ldf.model;

public class NodeCapabilityFile {
    private double languageVersion;
    private Node node;

    public double getLanguageVersion() {
        return this.languageVersion;
    }

    public void setLanguageVersion(double languageVersion) {
        this.languageVersion = languageVersion;
    }

    public Node getNode() {
        return this.node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    @Override
    public String toString() {
        String s = "";
        s += "node_capability_file;\n";
        s += "LIN_language_version = \"" + languageVersion + "\";\n";
        s += getNode().toString();
        return s;
    }
}
