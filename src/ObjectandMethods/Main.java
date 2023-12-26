package ObjectandMethods;

public class Main {
    public static void main(String[] args) {
        Authors gogol = new Authors("Николай", "Гоголь");
        Authors tolstoy = new Authors("Лев", "Толстой");
        Book deadSouls = new Book("Мертвые души", gogol, 1842);
        Book warAndPeace = new Book("Война и мир", tolstoy, 1865);
        System.out.println(deadSouls.getNameBook() + " " + deadSouls.getAuthors().getFirstName()+ " " + deadSouls.getAuthors().getSecondName() + " " + deadSouls.getYearPublisher() + " год " );
        deadSouls.setYearPublisher(1845);
        System.out.println(deadSouls.getNameBook() + " " + deadSouls.getAuthors().getFirstName()+ " " + deadSouls.getAuthors().getSecondName() + " " + deadSouls.getYearPublisher() + " год " );
        System.out.println(warAndPeace.getNameBook() + " " + warAndPeace.getAuthors().getFirstName()+ " " + warAndPeace.getAuthors().getSecondName() + " " + warAndPeace.getYearPublisher() + " год " );
        warAndPeace.setYearPublisher(1875);
        System.out.println(warAndPeace.getNameBook() + " " + warAndPeace.getAuthors().getFirstName()+ " " + warAndPeace.getAuthors().getSecondName() + " " + warAndPeace.getYearPublisher() + " год " );
    }
}
