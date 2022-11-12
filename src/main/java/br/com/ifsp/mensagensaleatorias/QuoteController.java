package br.com.ifsp.mensagensaleatorias;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mensagem")
public class QuoteController {

    @GetMapping
    public ResponseEntity<?> getMensagens(){
        var mensagem = MensagensAleatoriasApplication
                .restTemplate(new RestTemplateBuilder()).getForObject("https://api.quotable.io/random", Quote.class);

        return new ResponseEntity<>(mensagem.getContent(), HttpStatus.OK);
    }

}
