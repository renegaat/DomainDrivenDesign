package de.pearlbay.ddd.lombok;

import lombok.Value;

@Value
public class ValueObjectTest {
    private String value1;
    private String value2;

    public String values() {
        return value1 + " " + value2;
    }
}
