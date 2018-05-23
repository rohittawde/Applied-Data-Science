// Making a phonebook
class AddressBookEntry {
  String firstname;
  String lastname;
  int id;

  void print() {
    System.out.println("First Name: " + firstname);
    System.out.println("Last Name: " + lastname);
    System.out.println("ID: " +id);
  }

  public static void main(String[] arguments) {
    AddressBookEntry rohit = new AddressBookEntry();
    rohit.firstname = "Rohit";
    rohit.lastname = "Tawde";
    rohit.id = 22;

    System.out.println();
    rohit.print();

    AddressBookEntry anu = new AddressBookEntry();
    anu.firstname = "Anuja";
    anu.lastname = "Deshpande";
    anu.id = 21;

    System.out.println();
    anu.print();
  }
}
