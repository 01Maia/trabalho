package br.com.open.ai.cecg.OpenAI.http.impl;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.open.ai.cecg.OpenAI.http.OpenAIController;
import br.com.open.ai.cecg.OpenAI.http.data.request.ScienceFictionRequestDTO;
import br.com.open.ai.cecg.OpenAI.service.CallOpenAiService;

@RestController
@RequestMapping(value = "/openai-cecg")
public record OpenAIControllerImpl(CallOpenAiService service) implements OpenAIController {

    @Override
    @PostMapping(value = "/science-fiction")
    @ResponseStatus(HttpStatus.OK)
    public String generateScienceFiction(@RequestBody ScienceFictionRequestDTO requestDTO) {
        return service.generateScienceFiction(requestDTO);
    }
}
