# ChatGPTIntegration
Chat GPT Integration with Spring Boot Project


Option 1: ChatGPT as a separate service: Explain how to make HTTP requests to a ChatGPT service from the Spring Boot application. Demonstrate how to use RestTemplate or HttpClient to send a request and receive the response.

Option 2: ChatGPT as a library: Show how to add the ChatGPT library dependency to the project. Explain how to import and use the ChatGPT library to generate responses.

Steps to Integrate :

Create Spring Boot Project
Integrate the required dependency from the official documentation for Java
Write Controller class to expose the Rest End Points
Experience the different models provided by Open AI.
The response is of the format 
"id": "chatcmpl-6p9XYPYSTTRi0xEviKjjilqrWU2Ve",
  "object": "chat.completion",
  "created": 1677649420,
  "model": "gpt-3.5-turbo",
  "usage": {"prompt_tokens": 56, "completion_tokens": 31, "total_tokens": 87},
  "choices": [
    {
      "message": {
        "role": "assistant",
        "content": "The weather in New York City today is 75°F with clear skies. Have a great day!"
      },
      "finish_reason": "stop",
      "index": 0
    }
  ]
}
STEP 1) create a springboot project
STEP 2) chatgpt will give API
STEP 3) we can use Rest Template bean for API integration
STEP 4) we have configuration class and controller class
