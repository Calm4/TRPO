package MainPackage;

import java.util.*;

class Menu {
	// TODO Auto-generated constructor stub

	public static void main(String[] args) {
		Sneakers[] krosovki = { new Joggers("Joggers", "Подкрадули", 150, "БЕЛобувь", "Беларусь"),
				new Basketballs("Basketballs", "Nike Talant", 170, "Nike", "Китай"),
				new Joggers("Joggers", "ПушечкаКросовочкиОтВанечки", 120, "Gara Corp.", "Беларусь"),
				new Basketballs("Basketballs", "Чешки", 50, "Ашот и Друзья", "Чечня"),
				new Footballs("Footballs", "Подкрадули x Гаращук", 300, "Gara Corp.", "Беларусь"),
				new Joggers("Joggers", "Щенячий патруль, ласты", 450, "Multiversion", "Бельгия"),
				new Footballs("Footballs", "Abibas Barbos", 80, "KILOVATA", "Грузия"),
				new Basketballs("Basketballs", "BasketTrow", 100, "Mension", "США"),
				new Footballs("Footballs", "Бутсы ГараБолы", 330, "Gara Corp.", "Беларусь"),
				new Joggers("Joggers", "Туфли лакированные", 200, "Ашот и Друзья", "Грузия"), 
				
		};
				
		System.out.println("Количество производителей:");
		Menu.KolichestvoProizvoditeley(krosovki);
		System.out.println("Средняя стоимость обуви по каждому производителю:");
		Menu.SrednuyaStoimostObyviPoKajdomyProizvoditelu(krosovki);
		System.out.println("Средняя стоимость обуви по каждому типу:");
		Menu.SrednuyaStoimostObyviPoKajdomyType(krosovki);
	}

	public static void KolichestvoProizvoditeley(Sneakers[] krosovki) {
		int counter = 0;
		for (int i = 0; i < krosovki.length; i++) {
			for (int b = i + 1; b < krosovki.length; b++) {
				if (Objects.equals(krosovki[i].get_name(), krosovki[b].get_name())) {
					counter--;
					break;
				}
			}
			counter++;
		}

		System.out.println(counter);
	}

	public static void SrednuyaStoimostObyviPoKajdomyProizvoditelu(Sneakers[] krosovki) {
		ArrayList<String> set = new ArrayList<>();
		ArrayList<Float> numbers = new ArrayList<>();
		for (int i = 0; i < krosovki.length; i++) {
			set.add(krosovki[i].get_name());
			float sum;
			int counter = 0;
			sum = krosovki[i].getCost();
			for (int b = i + 1; b < krosovki.length; b++) {

				if (Objects.equals(krosovki[i].get_name(), krosovki[b].get_name())) {
					counter++;
					sum = sum + krosovki[b].getCost();
				}
			}
			counter++;
			numbers.add(sum / counter);
		}
		for (int i = 0; i < krosovki.length; i++) {
			for (int b = i + 1; b < krosovki.length; b++) {
				if (Objects.equals(krosovki[i].get_name(), krosovki[b].get_name())) {
					set.set(b, "null");
					numbers.set(b, 0F);
				}
			}

		}
		set.removeIf(type -> type.equals("null"));
		numbers.removeIf(type -> type.equals(0F));
		for (int i = 0; i < numbers.size(); i++) {
			System.out.print(set.get(i) + "=");
			System.out.println(numbers.get(i));
		}
	}

	public static void SrednuyaStoimostObyviPoKajdomyType(Sneakers[] krosovki) {
		ArrayList<String> set = new ArrayList<>();
		ArrayList<Float> numbers = new ArrayList<>();
		for (int i = 0; i < krosovki.length; i++) {
			set.add(krosovki[i].getType());
			float sum;
			int counter = 0;
			sum = krosovki[i].getCost();
			for (int b = i + 1; b < krosovki.length; b++) {

				if (Objects.equals(krosovki[i].getType(), krosovki[b].getType())) {
					counter++;
					sum = sum + krosovki[b].getCost();
				}
			}
			counter++;
			numbers.add(sum / counter);
		}
		for (int i = 0; i < krosovki.length; i++) {
			for (int b = i + 1; b < set.size(); b++) {
				if (Objects.equals(krosovki[i].getType(), krosovki[b].getType())) {
					set.set(b, "null");
					numbers.set(b, 0F);
				}
			}

		}

		set.removeIf(type -> type.equals("null"));
		numbers.removeIf(type -> type.equals(0F));
		for (int i = 0; i < numbers.size(); i++) {
			System.out.print(set.get(i) + "=");
			System.out.println(numbers.get(i));
		}
	}
}
