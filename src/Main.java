public class Main {
	public static void main(String[] args) {
		taskOne();
		taskTwo();
		taskThree();
		taskFour();
		taskFive();
		taskSix();
		taskSeven();
	}

	static void taskOne() {
		int ageLimit = 18;
		int ageCheck = 19;
		if (ageCheck >= ageLimit) {
			System.out.println("Если возраст человека равен " + ageCheck +
					", то он совершеннолетний");
		} else {
			System.out.println("Если возраст человека равен " + ageCheck +
					", то он не достиг совершеннолетия, нужно немного подождать");
		}
	}

	static void taskTwo() {
		int temperatureLimit = 5;
		double temperatureCheck = 5.2;
		if (temperatureCheck < temperatureLimit) {
			System.out.println("На улице " + temperatureCheck + " градусов, нужно надеть шапку");
		} else {
			System.out.println("На улице " + temperatureCheck + " градусов, можно идти без шапки");
		}
	}

	static void taskThree() {
		int speedLimit = 60;
		double speedCheck = 64;
		if (speedCheck > speedLimit) {
			System.out.println("Если скорость " + speedCheck + ", то придется заплатить штраф");
		} else {
			System.out.println("Если скорость " + speedCheck + ", то можно ездить спокойно");
		}
	}

	static void taskFour() {
		int age = 16;
		boolean mustGoToKinderGarden = age >= 2 && age <= 6;
		boolean mustGoToSchool = age >= 7 && age <= 18;
		boolean mustGoToUniversity = age > 18 && age < 24;
		boolean mustGoToWork = age >= 24;
		if (mustGoToWork) {
			System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
		} else {
			if (mustGoToKinderGarden) {
				System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
			}
			if (mustGoToSchool) {
				System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
			}
			if (mustGoToUniversity) {
				System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
			}
		}
	}

	static void taskFive() {
		int age = 4;
		boolean canNotRideAttraction = age <= 5;
		boolean rideWithAdult = age > 5 && age <= 14;
		boolean rideOne = age > 14;
		if (canNotRideAttraction) {
			System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
		}
		if (rideWithAdult) {
			System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
		}
		if (rideOne) {
			System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
		}
	}

	static void taskSix() {
		int capacityRailCar = 102;
		int seatingPassengerSeats = 60;
		int standingPassengerSeats = capacityRailCar - seatingPassengerSeats;

		int countSeatPassengers = 8;
		int countStandPassengers = 30;


		if (capacityRailCar > (countSeatPassengers + countStandPassengers)) {
			if (seatingPassengerSeats >= countSeatPassengers) {
				System.out.println("Есть " + (seatingPassengerSeats - countSeatPassengers) + " сидячих мест");
			} else {
				System.out.println("Число допустимых сидячих пассажиров превышено на " + (countSeatPassengers - seatingPassengerSeats) + " человек");
			}

			if (standingPassengerSeats >= countStandPassengers) {
				System.out.println("Есть " + (standingPassengerSeats - countStandPassengers) + " стоячих мест");
			} else {
				System.out.println("Число допустимых стоячих пассажиров превышено на " + (countStandPassengers - standingPassengerSeats) + " человек");
			}
		} else {
			System.out.println("Вагон уже полностью забит");
		}

	}

	static void taskSeven() {
		int one = 54;
		int two = 67;
		int three = 66;
		boolean allNoEqually = one != two && two != three && one != three;
		boolean allEqually = one == two && two == three;

		if (allNoEqually) {
			if (one > two && one > three) {
				System.out.println("Число one большее и равно " + one);
			} else {
				if (two > three) {
					System.out.println("Число two большее и равно " + two);
				} else {
					System.out.println("Число three большее и равно " + three);
				}
			}
		} else {
			if (allEqually) {
				System.out.println("Все числа равны " + one);
			} else {
				if (one == two) {
					if (one > three) {
						System.out.println("Число one и two большие и равны " + one);
					} else {
						System.out.println("Число three большее и равно " + three);
					}
				}
				if (one == three) {
					if (one > two) {
						System.out.println("Число one и three большие и равны " + one);
					} else {
						System.out.println("Число two большее и равно " + two);
					}
				}

				if (two == three) {
					if (two > one) {
						System.out.println("Число two и three большие и равны " + two);
					} else {
						System.out.println("Число one большее и равно " + one);
					}
				}
			}
		}
	}
}