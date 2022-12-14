package com.chehejia.vfsc.bsp.ldf.model;

public class Signal {
    private Frame frame;
    private String name;
    private int size;
    private SignalValue initialValue;
    private int offset;
    private Encoding encoding;

    public static int signalHash(byte[] input, int i) {
        return (input.length != i) ? ((int) input[i]) + 33 * signalHash(input, i + 1) : 5381;
    }

    public Signal(String name) {
        this.name = name;
    }

    public Frame getFrame() {
        return frame;
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public SignalValue getInitialValue() {
        return this.initialValue;
    }

    public void setInitialValue(SignalValue initialValue) {
        this.initialValue = initialValue;
    }

    public int getOffset() {
        return this.offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public Encoding getEncoding() {
        return this.encoding;
    }

    public void setEncoding(Encoding encoding) {
        this.encoding = encoding;
    }

    public int getSID() {
        return signalHash(this.name.getBytes(), 0);
    }

    @Override
    public String toString() {
        String s = getName() + " {\n";
        s += "\tsize = " + getSize() + ";\n";
        s += "\tinit_value = " + getInitialValue() + ";\n";
        s += "\toffset = " + getOffset() + ";\n";
        if (encoding != null)
            s += "\t" + getEncoding().getName() + ";\n";
        return s + "}";
    }
}
