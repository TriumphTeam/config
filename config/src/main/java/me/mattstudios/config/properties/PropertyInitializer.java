package me.mattstudios.config.properties;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * Convenience class for instantiating {@link Property} objects. You can use
 * a static import for the methods for a short, convenient way to declare properties.
 * <p>
 * If you use additional property types, it may make the most sense to write your own
 * property initializer class similar to this one, or extend this class to keep the
 * default methods.
 */
public class PropertyInitializer {

    protected PropertyInitializer() {
        // Protected constructor to allow inheritance
    }

    /**
     * Creates a new boolean property.
     *
     * @param path the property's path
     * @param defaultValue the default value
     * @return the created property
     */
    public static Property<Boolean> newProperty(String path, boolean defaultValue) {
        return new BooleanProperty(path, defaultValue);
    }

    /**
     * Creates a new integer property.
     *
     * @param path the property's path
     * @param defaultValue the default value
     * @return the created property
     */
    public static Property<Integer> newProperty(String path, int defaultValue) {
        return new IntegerProperty(path, defaultValue);
    }

    /**
     * Creates a new double property.
     *
     * @param path the property's path
     * @param defaultValue the default value
     * @return the created property
     */
    public static Property<Double> newProperty(String path, double defaultValue) {
        return new DoubleProperty(path, defaultValue);
    }

    /**
     * Creates a new String property.
     *
     * @param path the property's path
     * @param defaultValue the default value
     * @return the created property
     */
    public static Property<String> newProperty(String path, String defaultValue) {
        return new StringProperty(path, defaultValue);
    }

    /**
     * Creates a new enum property.
     *
     * @param clazz the enum class
     * @param path the property's path
     * @param defaultValue the default value
     * @param <E> the enum type
     * @return the created enum property
     */
    public static <E extends Enum<E>> Property<E> newProperty(Class<E> clazz, String path, E defaultValue) {
        return new EnumProperty<>(clazz, defaultValue);
    }

    /**
     * Creates a new String list property.
     *
     * @param path the property's path
     * @param defaultValues the default value of the property
     * @return the created list property
     */
    public static Property<List<String>> newListProperty(String path, List<String> defaultValues) {
        // does not have the same name as not to clash with #newProperty(String, String)
        return new StringListProperty(path, defaultValues);
    }

    /**
     * Creates a new String set property where all values are lowercase.
     *
     * @param path the property's path
     * @param defaultValues the items in the default set
     * @return the created set property
     */
    public static Property<Set<String>> newLowercaseStringSetProperty(String path, String... defaultValues) {
        return new LowercaseStringSetProperty(path, defaultValues);
    }

    /**
     * Creates a new String set property where all values are lowercase.
     *
     * @param path the property's path
     * @param defaultValues the default value of the property
     * @return the created set property
     */
    public static Property<Set<String>> newLowercaseStringSetProperty(String path, Collection<String> defaultValues) {
        return new LowercaseStringSetProperty(path, defaultValues);
    }

    /**
     * Creates a new bean property.
     *
     * @param beanClass the JavaBean class
     * @param path the property's path
     * @param defaultValue default value
     * @param <B> the bean type
     * @return the created bean property
     */
    public static <B> Property<B> newBeanProperty(Class<B> beanClass, String path, B defaultValue) {
        return new BeanProperty<>(beanClass, defaultValue);
    }

}