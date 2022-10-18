public class Burger {
    String bun;
    String meat;
    String cheese;
    String greens;
    String mayonnaise;





    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;


        System.out.println("Burger standard = " + this.Composition());
    }

    String Composition() {
        return (String) (bun + meat + cheese + greens + mayonnaise);

    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;

        System.out.println("Burger diet = " + this.Composition2());
    }

    String Composition2() {
        return (String) (bun + meat + cheese + greens);

    }

    public Burger() {
         bun="bun";
        meat="doubl emeat";
        cheese = "cheese";
        greens = "greens";
        mayonnaise = "mayonnaise";


        System.out.println("Burger doublmeat = " + this.Composition3());
    }

    String Composition3() {
        return (String) (bun+"  " + meat +"  "+ cheese +"  "+ greens+"  "  + mayonnaise);

    }


}