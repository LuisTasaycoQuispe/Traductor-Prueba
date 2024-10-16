package pe.edu.vallegrande.traductor.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
    
@Data
@Getter
@Setter
@Table("translator")
public class Traslator {
    @Id
    private Long id;
    private String input_text;
    private String translated_text;
    private String from_language;
    private String to_language;
    private String state;
}
