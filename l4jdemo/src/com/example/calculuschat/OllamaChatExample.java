package com.example.calculuschat;
import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.ollama.OllamaChatModel;
import static dev.langchain4j.model.chat.request.ResponseFormat.JSON;


//Create chat model
//set base url (in our case it's localhost:11434)
//set model name
//Call chatmodel.chat with the question, the method chat returns a string

class OllamaChatExample {
  static String MODEL_NAME = "Mathstral"; // try other local ollama model names
  static String BASE_URL = "http://localhost:11434"; // local ollama base url

  public static void main(String[] args) {
      ChatModel model = OllamaChatModel.builder()
              .baseUrl(BASE_URL)
              .modelName(MODEL_NAME)
              .build();
      String answer = model.chat("Explain integral calculus.");
      System.out.println(answer);


      //Different response format
      model = OllamaChatModel.builder()
              .baseUrl(BASE_URL)
              .modelName(MODEL_NAME)
              .responseFormat(JSON)
              .build();

      String json = model.chat("Explain integral calculus.");
      System.out.println(json);
    }
}