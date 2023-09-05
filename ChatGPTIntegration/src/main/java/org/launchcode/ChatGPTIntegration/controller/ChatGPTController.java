package org.launchcode.ChatGPTIntegration.controller;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.completion.CompletionResult;
import com.theokanning.openai.completion.chat.ChatCompletionRequest;
import com.theokanning.openai.service.OpenAiService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ChatGPTController {
    @GetMapping("/getChat/{prompt}")
    public CompletionResult getPrompt(@PathVariable String prompt){
        ///v1/completions (Legacy)	text-davinci-003, text-davinci-002, text-davinci-001, text-curie-001, text-babbage-001, text-ada-001, davinci, curie, babbage, ada
        OpenAiService service = new OpenAiService("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");

        CompletionRequest completionRequest = CompletionRequest.builder()
                .prompt(prompt)
                .model("text-davinci-003")
                .echo(true)
                .build();
       return service.createCompletion(completionRequest);

    }

}
