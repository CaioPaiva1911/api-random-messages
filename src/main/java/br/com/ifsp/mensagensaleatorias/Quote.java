package br.com.ifsp.mensagensaleatorias;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
    private String content;
    private String author;
    private String authorSlug;
    private Long lenght;
    private String[] tags;
}
