package top.psiphonc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {
    private Integer bookId;
    private String bookName;
    private Integer bookCount;
    private String detail;

}
