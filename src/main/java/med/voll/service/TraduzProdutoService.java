package med.voll.service;

import med.voll.model.Produto;
import space.dynomake.libretranslate.Language;
import space.dynomake.libretranslate.Translator;

public class TraduzProdutoService {

    public void traduz(Produto produto){
        String name = Translator.translate(Language.ENGLISH, Language.PORTUGUESE, produto.getName());
        String category = Translator.translate(Language.ENGLISH, Language.PORTUGUESE, produto.getCategory());
        String description = Translator.translate(Language.ENGLISH, Language.PORTUGUESE, produto.getDescription());

        produto.setName(name);
        produto.setCategory(category);
        produto.setDescription(description);
    }

}
