public class Classroom {
    public static void main(String[] args) {
        Wilder zura = new Wilder("Zura", true);
        Wilder gersey = new Wilder("Gersey", true);
        Wilder raph = new Wilder("Raph", false);

        System.out.println(zura.whoAmi());
        System.out.println(gersey.whoAmi());
        System.out.println(raph.whoAmi());
    }
}
