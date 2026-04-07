
public class ConexaoArduino {

    // Simula a leitura da porta Serial
    public String lerPortaSerial() {
        // Simulando a linha: Temperatura;Umidade;Luz
        return "29.5;49;45"; 
    }

    // Pega o texto bruto e transforma no objeto "DadosAmbientais"
    public DadosAmbientais separarDados(String linha) {
        try {
            // O comando split separa os valores onde encontrar
            String[] partes = linha.split(";");
            
            // Converte os textos para os formatos numéricos corretos
            double temp = Double.parseDouble(partes[0]);
            int umid = Integer.parseInt(partes[1]);
            int luz = Integer.parseInt(partes[2]);
            
            // Cria e retorna o objeto pronto
            return new DadosAmbientais(temp, umid, luz);
            
        } catch (Exception e) {
            System.out.println("Erro ao processar dados brutos: " + e.getMessage());
            return null;
        }
    }
}