package com.formation.creation;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/*
 * essai de l'implementation d'un singleton generique
 * */
public class Singleton {
	private static Map<String, Object> instances = new HashMap<String, Object>();

	private Singleton() {
	}

	@SuppressWarnings("unchecked")
	public static <T> T Instance(String name, Object... initargs) {
		Class<T> c;
		try {
			c = (Class<T>) Class.forName(name);
		} catch (ClassNotFoundException e1) {
			System.err.println("ClassNotFoundException: " + name);
			e1.printStackTrace();
			return null;
		}

		if (!instances.containsKey(name)) {
			T inst;
			try {
				Class<?>[] parameterTypes = new Class<?>[initargs.length];
				for (int i = 0; i < initargs.length; i++) {
					parameterTypes[i] = initargs[i].getClass();
				}
				inst = c.getConstructor(parameterTypes).newInstance(initargs);
			} catch (IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException
					| InstantiationException | IllegalAccessException e) {
				System.err.println("Can't get or call constructor.");
				e.printStackTrace();
				return null;
			}
			instances.put(name, inst);
		} else if (initargs.length > 0) {
			// passing parameters when wanted to retrieve an existing object
			throw new IllegalArgumentException("Don't pass parameters when the object already exists.");
		}

		return c.cast(instances.get(name));
	}
}
