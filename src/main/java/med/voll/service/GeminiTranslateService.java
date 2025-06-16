package med.voll.service;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.googleai.GoogleAiGeminiChatModel;

public class GeminiTranslateService {

    public static String traduzir(String texto, String lingua) {
        final String KEY_API_GEMINI = System.getenv("KEY_API_GEMINI");

            ChatModel gemini = GoogleAiGeminiChatModel.builder()
                    .apiKey(KEY_API_GEMINI)
                    .modelName("gemini-1.5-flash-latest")
                    .build();

            String response = gemini.chat("me da resposta somente da tradução de " + texto + " em " + lingua);
            return response.trim();
    }
}
