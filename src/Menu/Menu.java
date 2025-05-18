package Menu;

public class Menu {
    public void showMenu() {
        String mainMenu = """
                Seja bem-vindo(a) ao Conversor de Moedas
                
                1) Dólar ===> Peso argentino
                2) Peso argentino ===> Dólar
                3) Dólar ===> Real Brasileiro
                4) Real Brasileiro ===> Dólar
                5) Dólar ===> Peso colombiano
                6) Peso colombiano ===> Dólar
                7) Sair
                Escolhar uma opção válida para realizar a conversão""";
        System.out.println(mainMenu);
    }
}