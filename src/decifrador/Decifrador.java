package decifrador;
import java.util.*;
public class Decifrador {
    public static void main(String[] args) {

        System.out.println("======= INPUT =======");
        Scanner scan=new Scanner (System.in);
        System.out.print("Digite aqui:");
        Palavra novaPalavra1= new Palavra(); novaPalavra1.setPalavra(scan.next());
        System.out.print("Digite aqui:");
        Palavra novaPalavra2= new Palavra(); novaPalavra2.setPalavra(scan.next());
        System.out.print("Digite aqui:");
        Palavra novaPalavra3= new Palavra(); novaPalavra3.setPalavra(scan.next());
        System.out.print("Digite aqui:");
        Palavra novaPalavra4= new Palavra(); novaPalavra4.setPalavra(scan.next());
        System.out.print("Digite aqui:");
        Palavra novaPalavra5= new Palavra(); novaPalavra5.setPalavra(scan.next());
        
        novaPalavra1.setNumeroDeLetras(novaPalavra1.getPalavra().length());
        novaPalavra2.setNumeroDeLetras(novaPalavra2.getPalavra().length());
        novaPalavra3.setNumeroDeLetras(novaPalavra3.getPalavra().length());
        novaPalavra4.setNumeroDeLetras(novaPalavra4.getPalavra().length());
        novaPalavra5.setNumeroDeLetras(novaPalavra5.getPalavra().length());

        System.out.println("======= OUTPUT =======");
        
        ArrayList<String> palavras = new ArrayList<>();
        palavras.add(novaPalavra1.getNumeroDeLetras()+" - "+novaPalavra1.getPalavra());
        palavras.add(novaPalavra2.getNumeroDeLetras()+" - "+novaPalavra2.getPalavra());
        palavras.add(novaPalavra3.getNumeroDeLetras()+" - "+novaPalavra3.getPalavra());
        palavras.add(novaPalavra4.getNumeroDeLetras()+" - "+novaPalavra4.getPalavra());
        palavras.add(novaPalavra5.getNumeroDeLetras()+" - "+novaPalavra5.getPalavra());
        
        Collections.reverse(palavras);
        
        for (String palavra : palavras ){
            System.out.println(palavra);
        }
        System.out.println("======= END =======");
    }
}