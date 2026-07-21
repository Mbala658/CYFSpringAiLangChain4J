package com.example.calculuschat;


import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.chat.response.ChatResponse;
import dev.langchain4j.model.ollama.OllamaChatModel;

public class CalculusChatDemo {
    static String MODEL_NAME = "Mathstral"; // try other local ollama model names
    static String BASE_URL = "http://localhost:11434"; // local ollama base url

    public static void main(String[] args) {
        // Instantiate the Ollama model
        //OllamaChatModel model = new OllamaChatModel("ollama-integration");

        // Build the chat chain
        ChatModel chatModel = OllamaChatModel.builder()
                .baseUrl(BASE_URL)
                .modelName(MODEL_NAME)
                .build();

        // First question
        String prompt1 = "Explain the calculus integral: What is integration?";
        String answer = chatModel.chat(prompt1);
        System.out.println("LLM says: " + answer);


    }
}
