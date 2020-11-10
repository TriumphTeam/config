package me.mattstudios.config.properties;

import me.mattstudios.config.properties.types.PrimitivePropertyType;

/**
 * Double property. This extension exists for convenience and backwards compatibility.
 */
public class DoubleProperty extends TypeBasedProperty<Double> {

    public DoubleProperty(String path, double defaultValue) {
        super(defaultValue, PrimitivePropertyType.DOUBLE);
    }
}
