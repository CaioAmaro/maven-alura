package med.voll;

import com.opencsv.bean.CsvToBeanBuilder;
import med.voll.model.Produto;
import med.voll.service.TraducaoProdutoService;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        TraducaoProdutoService traduzProdutoService = new TraducaoProdutoService();

        List<Produto> produtos = new CsvToBeanBuilder(new FileReader("src/main/resources/products.csv"))
                .withType(Produto.class).build().parse();

        System.out.println("Produtos não traduzidos");
        for(Produto produto: produtos){
            System.out.println(produto);
        }

        for(Produto produto: produtos){
            traduzProdutoService.traduz(produto, "SUECO");
        }

        System.out.println();
        System.out.println("Produtos já traduzidos.");
        for(Produto produto: produtos){
            System.out.println(produto);
        }

    }
}