class PhoneBook {

    HashMap<String, HashSet<Long>> mapPhoneBook;

    PhoneBook() {
        this.mapPhoneBook = new HashMap<>();
    }

    void add(String surname, long numberOne, long numberTwo, long numberThree) {
        HashSet<Long> setPhoneBook = mapPhoneBook.getOrDefault(surname, new HashSet<>()); //if there is no value with such a key, then return null
        setPhoneBook.add(numberOne);
        setPhoneBook.add(numberTwo);
        setPhoneBook.add(numberThree);

        mapPhoneBook.put(surname, setPhoneBook);
    }

    void get(String surname) {
        System.out.println(surname + "'s phone number: \n" + mapPhoneBook.getOrDefault(surname, new HashSet<>()));
    }
}