import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//Leitura de Arquivos Classes Buffers
public class Main {
    public static void main(String[] args) throws IOException {
        String arquivo = "/C://Users//Downloads//ativos.csv/";

        BufferedReader leitor = new BufferedReader(new FileReader(arquivo));

        String linha;
        while (true){
            try {
                if (!((linha = leitor.readLine()) != null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            String[] dado = linha.split(",");
            String hosts = dado[0];
            String ips = dado[1];
            String so = dado[2];

            System.out.println("Host: "+ hosts);
            System.out.println("IPS: "+ ips);
            System.out.println("SO: "+ so);
        }

    }
}