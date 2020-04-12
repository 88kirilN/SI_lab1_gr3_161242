class Item {
	int id;
	String ime;
	double price;

	//TODO add variable.
	Character Tip;

	//TODO constructor
	Item(int id, String ime, double cena, Character Tip){
		this.id = id;
		this.ime = ime;
		this.cena = cena;
		this.Tip = Tip;
	}

	//TODO setters and getters
	public void setId(int newId){
		this.id = newId;
	}
	public void setName(String newName){
		this.ime = newIme;
	}
	public void setPrice(double newPrice){
		this.cena = newCena;
	}
	public void setTaxType(Character newTaxType){
		this.Tip = newTip;
	}
	
	public int getId(){
		return id;
	}
	public String getIme(){
		return ime;
	}
	public double getCena(){
		return cena;
	}
	public Character getTip(){
		return Tip;
	}
	
	double taxReturn () { 
		//TODO
		if(Tip == 'A')
			return cena * 0.18 * 0.15;
		else if(Tip == 'B')
			return cena * 0.05 * 0.15;
		else
			return 0;
	}
}