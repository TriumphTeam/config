package me.mattstudios.config.properties.types;

import me.mattstudios.config.properties.Property;
import me.mattstudios.config.properties.convertresult.ConvertErrorRecorder;
import org.jetbrains.annotations.NotNull;

import org.jetbrains.annotations.Nullable;

/**
 * Property type: provides methods for converting between property resource and a defined type
 * and allows to be used in generic structures such as an array property or map property.
 *
 * @param <T> type of the values the property type handles
 */
public interface PropertyType<T> {

    /**
     * Converts the given object (typically read from a property resource) to the given type, if possible.
     * Returns null otherwise.
     *
     * @param object        the object to convert
     * @param errorRecorder error recorder to register errors even if a valid value is returned
     * @return the converted value, or null
     */
    @Nullable
    T convert(@Nullable Object object, ConvertErrorRecorder errorRecorder, @NotNull final Property<?> parentProperty);

    /**
     * Converts the given value to its export value. (Converts in the opposite way of {@link #convert}.)
     *
     * @param value the value to convert
     * @return the value to use in the property export
     */
    Object toExportValue(final T value, @NotNull final Property<?> parentProperty);

}