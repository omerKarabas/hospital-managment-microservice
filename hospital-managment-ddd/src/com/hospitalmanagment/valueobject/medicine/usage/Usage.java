package com.hospitalmanagment.valueobject.medicine.usage;

import java.util.Objects;

import com.hospitalmanagment.annotaions.ValueObject;

@ValueObject
public final class Usage {

	private Time time;
	private Food food;
	private int number;

	public static Usage of(Time time, Food food, int number) {
		return new Usage(time,food,number);
	}
	private Usage(Time time, Food food, int number) {
		super();
		this.time = time;
		this.food = food;
		this.number = number;
	}

	public Time getTime() {
		return time;
	}

	public Food getFood() {
		return food;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public int hashCode() {
		return Objects.hash(food, number, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usage other = (Usage) obj;
		return food == other.food && number == other.number && time == other.time;
	}

	@Override
	public String toString() {
		return "Usage [time=" + time + ", food=" + food + ", number=" + number + "]";
	}

}
