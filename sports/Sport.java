package tw.com.softleader.sample.sports;

public class Sport {

	private Long id;
	private String name;
	private String people;
	
	

	@Override
	public String toString() {
		return "Sport [ id = " + id + ", name = " + name + " , people = " + people + "]s";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPeople() {
		return people;
	}

	public void setPeople(String people) {
		this.people = people;
	}

}