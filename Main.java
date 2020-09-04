public class Main {
    public static void main(String[] args) {
        String[] arrayOfStrings = new String[]{"Red", "Orange", "Yellow", "Green", "Blue",
                "Violet", "Orange", "Purple", "Yellow", "Green"};
        Set<String> stringSet = new LinkedHashSet<>(Arrays.asList(arrayOfStrings));
        System.out.println("Unique words: " + stringSet + "\n");

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Eugene", 7922470, 7909049, 7906838);
        phoneBook.add("Maria", 7960838, 0, 0);
        phoneBook.add("Vyacheslav", 7981122, 0, 0);
        phoneBook.add("Vladimir",7913479 , 7982901, 0);
        phoneBook.add("Natalia", 795269, 220303, 7912908);

        phoneBook.get("Eugene"); // get numbers  by surname
    }
}