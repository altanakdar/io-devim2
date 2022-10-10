package kodlamaIODemo.entities;

public class Teacher {
	private int Id;
	private String Title;
	private String Name;
	private String Surname;
	
	public Teacher() {
		
	}

	public Teacher(int id, String title, String name, String surname) {

		Id = id;
		Title = title;
		Name = name;
		Surname = surname;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSurname() {
		return Surname;
	}

	public void setSurname(String surname) {
		Surname = surname;
	}
	
	

}
