package com.efdouk.apps.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {

    private static Map<ObjectType, PrototypeCapable> prototypes = new HashMap<>();

    static {
        prototypes.put(ObjectType.MOVIE, new Movie("The Dark Knight"));
        prototypes.put(ObjectType.ALBUM, new Album("Hotel California - Eagles"));
        prototypes.put(ObjectType.TV_SHOW, new TvShow("Friends"));
    }

    public static PrototypeCapable getClone(ObjectType type) {
        try {
            return prototypes.get(type).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

}
