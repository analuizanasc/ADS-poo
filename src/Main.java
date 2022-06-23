import modelos.*;

public class Main {
    public static void main(String[] args) {
        CargoComissionado comissionado1 = new CargoComissionado("Ana", "27/08/1992", "237.954.687-81", 478, 3_000);

        System.out.println(comissionado1);
        System.out.print("Salário final: ");
        System.out.println(comissionado1.CalculaSalario((0.5)));
        System.out.println("--------------------------------" );

        CargoSalarioFixo fixo1 = new CargoSalarioFixo("Luiza", "21/02/1990","090.555.784-91",154,2_000);

        System.out.println(fixo1);
        System.out.print("Salário final: ");
        System.out.println(fixo1.CalculaSalario(0.3));
        System.out.println("--------------------------------" );
    }

}
