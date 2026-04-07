
public class Main {

    public static void main(String[] args) {
        System.out.println("SISTEMA DE MONITORAMENTO INICIADO");

        // 1. Cria a conexão
        ConexaoArduino conexao = new ConexaoArduino();

        // 2. Lê o dado que vem do "cabo USB"
        String dadoRecebido = conexao.lerPortaSerial();
        System.out.println("Dados Brutos Recebidos: " + dadoRecebido);

        // 3. Processa e gera o objeto de dados
        DadosAmbientais dadosFinal = conexao.separarDados(dadoRecebido);

        // 4. Mostra o relatório para o usuário
        if (dadosFinal != null) {
            dadosFinal.exibirRelatorio();
        }

        System.out.println("SISTEMA FINALIZADO COM SUCESSO.");
    }
}