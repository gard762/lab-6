package lab6;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Visitor {
    private String name;
    private String surName;
    private List<Book> favoriteBooks;
    private String phone;
    private boolean subscribed;
}