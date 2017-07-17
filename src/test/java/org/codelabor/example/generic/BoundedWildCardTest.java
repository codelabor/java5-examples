package org.codelabor.example.generic;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BoundedWildCardTest {

	private static final Logger logger = LoggerFactory.getLogger(BoundedWildCardTest.class);

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
	public void testCar() {
		WildcardGeneric<Car> wildcardGeneric = new WildcardGeneric<Car>();
		wildcardGeneric.setWildcard(new Car("car1"));
		boundedWildcardMethod(wildcardGeneric);
	}

}
