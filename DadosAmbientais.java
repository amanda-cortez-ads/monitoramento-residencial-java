public class DadosAmbientais {
    private double temperatura;
    private int umidade;
    private int luminosidade;

    // Construtor
    public DadosAmbientais(double temperatura, int umidade, int luminosidade) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.luminosidade = luminosidade;
    }

    public void exibirRelatorio() {
        System.out.println("===== RELATÓRIO DO AMBIENTE =====");
        System.out.println("Temperatura: " + temperatura + " °C");
        System.out.println("Umidade:     " + umidade + " %");
        System.out.println("Luminosidade: " + luminosidade + " %");
        
        // Lógica de Alertas (Regra de Negócio)
        if (temperatura > 30.0) {
            System.out.println("[ALERTA]: O ambiente está muito quente!");
        } else if (temperatura < 18.0) {
            System.out.println("[ALERTA]: O ambiente está muito frio!");
        } else {
            // Se não é maior que 30 nem menor que 18, está entre eles
            System.out.println("Temperatura ambiente agradável.");
        }

        if (luminosidade < 40) {
            System.out.println("[ALERTA]: Nível de luz baixo. Acionar iluminação.");
        } else {
            System.out.println("Iluminação adequada.");
        }
        System.out.println("==================================");
    }
}