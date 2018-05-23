class MyEntry extends AddressBookEntry {
	int age;
	void birthday () {
		age = age + 1;
	}

	@Override
	void print() {
		super.print();
		System.out.println("Age: " + age);
	}

	public static void main (String[] arguments) {
		MyEntry liam = new MyEntry();
		liam.firstname = "William";
		liam.lastname = "Windsor";
		liam.id = 34;
		liam.age = 35;

		liam.print();

		liam.birthday();

		liam.print();
	}
}