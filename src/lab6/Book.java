package lab6;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String name;
    private String author;
    private int publishingYear;
    private String isbn;
    private String publisher;
}