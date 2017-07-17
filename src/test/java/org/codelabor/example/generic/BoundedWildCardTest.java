package org.codelabor.example.generic;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BoundedWildCardTest {

	private static final Logger logger = LoggerFactory.getLogger(BoundedWildCardTest.class);

	private <T extends Car> void boundedGenericMethod(WildcardGeneric<T> wildcardGeneric, T item) {
		wildcardGeneric.setWildcard(item);
		Car car = wildcardGeneric.getWildcard();
		logger.info(car.toString());
	}

	private void boundedWildcardMethod(WildcardGeneric<? extends Car> wildcardGeneric) {
		Car car = wildcardGeneric.getWildcard();
		logger.info(car.toString());
	}

	@Test
	public void testBus() {
		WildcardGeneric<Bus> wildcardGeneric = new WildcardGeneric<Bus>();
		wildcardGeneric.setWildcard(new Bus("bus1"));
		boundedWildcardMethod(wildcardGeneric);
	}

	@Test
	public void testBus2() {
		WildcardGeneric<Bus> wildcardGeneric = new WildcardGeneric<Bus>();
		boundedGenericMethod(wildcardGeneric, new Bus("bus1"));
	}

	@Test
	public void testCar() {
		WildcardGeneric<Car> wildcardGeneric = new WildcardGeneric<Car>();
		wildcardGeneric.setWildcard(new Car("car1"));
		boundedWildcardMethod(wildcardGeneric);
	}

	@Test
	public void testCar2() {
		WildcardGeneric<Car> wildcardGeneric = new WildcardGeneric<Car>();
		boundedGenericMethod(wildcardGeneric, new Car("car1"));
	}

}
