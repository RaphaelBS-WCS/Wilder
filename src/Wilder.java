public class Wilder {

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private String name;

    public boolean isAware() {
        return aware;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    private boolean aware;

    public Wilder(String name, Boolean aware) {
        this.name = name;
        this.aware = aware;
    }

    // Ajoute une méthode whoAmI() retournant le texte "Je m'appelle firstname et je suis aware"
    // ou "Je m'appelle firstname et je ne suis pas aware", en fonction de l'état des attributs firstname et aware
    public String whoAmi() {
        if (this.isAware()) {
            return  "Je m'appelle " + this.getName() + " et je suis aware";
        } else {
           return "Je m'appelle " + this.getName() + " et je ne suis pas aware";
        }
    }
}
