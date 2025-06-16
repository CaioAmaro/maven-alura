package med.voll.service;

import med.voll.model.Produto;

public class TraducaoProdutoService {

    public void traduz(Produto produto, String lingua){
        String name = GeminiTranslateService.traduzir(produto.getName(), lingua);
        String category = GeminiTranslateService.traduzir(produto.getCategory(), lingua);
        String description = GeminiTranslateService.traduzir(produto.getDescription(), lingua);

        produto.setName(name);
        produto.setCategory(category);
        produto.setDescription(description);
    }
}
