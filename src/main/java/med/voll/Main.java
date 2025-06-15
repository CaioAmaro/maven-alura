package med.voll;

import com.opencsv.bean.CsvToBeanBuilder;
import med.voll.model.Produto;
import med.voll.service.TraduzProdutoService;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        List<Produto> produtos = new CsvToBeanBuilder(new FileReader("src/main/resources/products.csv"))
                .withType(Produto.class).build().parse();

        for(Produto produto: produtos){
            System.out.println(produto);
        }

        TraduzProdutoService traduzProdutoService = new TraduzProdutoService();

        for(Produto produto: produtos){
            traduzProdutoService.traduz(produto);
        }

        for(Produto produto: produtos){
            System.out.println(produto);
        }

    }
}