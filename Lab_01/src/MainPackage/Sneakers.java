package MainPackage;

public class Sneakers {
	private String name; // ИМЯ
	private Float cost; // СТОИМОСТЬ
	private String type; // ТИП ОБУВИ
	private Producer producer; // ПОСТАВЩИК

	// КОНСТРУКТОР
	public Sneakers(String type, String name, Float cost, String name_, String country) {
		this.type = type;
		this.name = name;
		this.cost = cost;
		producer = new Producer(name_, country);
		
	}
	// НИЖЕ ИДУТ ГЕТЕРЫ И СЕТЕРЫ ДЛЯ ВСЕХ ПОЛЕЙ
	public void setProducer(Producer producer) {
		this.producer = producer;
	}

	public Producer getProducer() {
		return producer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getCost() {
		return cost;
	}

	public void setCost(Float cost) {
		this.cost = cost;
	}


	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public String get_name() {
		return producer.get_name();
	}

	public String get_country() {
		return producer.get_country();
	}

	private class Producer {
		private String _name;
		private String _country;

		public Producer(String _name, String _country) {
			this._name = _name;
			this._country = _country;
		}

		public String get_name() {
			return _name;
		}

		public void set_name(String _name) {
			this._name = _name;
		}

		public String get_country() {
			return _country;
		}

		public void set_country(String _country) {
			this._country = _country;
		}

	}

}
