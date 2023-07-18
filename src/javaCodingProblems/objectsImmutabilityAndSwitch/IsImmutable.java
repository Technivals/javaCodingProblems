package javaCodingProblems.objectsImmutabilityAndSwitch;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public interface IsImmutable {

    static boolean isImmutable(Object object) {
        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();

        if(!Modifier.isFinal(clazz.getModifiers())) {
            return false;
        }

        for (Field field : fields) {
            if (field.getName().equals("hash") || field.getName().equals("hashIsZero")) {
                continue; // Skip the 'hash' field
            }

            if (!Modifier.isFinal(field.getModifiers())) {
                return false;
            }
        }
        return true;
    }
}
