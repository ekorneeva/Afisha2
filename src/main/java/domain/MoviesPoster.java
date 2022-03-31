package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class MoviesPoster {

    private int Id;
    private String movieName;
    private String movieGenre;
    private int year;

    //  public MoviesPoster(int resultLengt) {
    //  if (resultLengt > 10) {
    //      return;
    //  } else {
    //      this.resultLengt = resultLengt;
    //  }
}
