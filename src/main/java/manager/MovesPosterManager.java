package manager;

import domain.MoviesPoster;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class MovesPosterManager {

    private MoviesPoster[] movies = new MoviesPoster[0];
    private int limitLength = 10;

    public void add(MoviesPoster movie) {
        MoviesPoster[] tmp = new MoviesPoster[movies.length + 1];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        tmp[tmp.length - 1] = movie;
        this.movies = tmp;
    }

    public MoviesPoster[] getAll() {
        MoviesPoster[] result = new MoviesPoster[Math.min(movies.length, limitLength)];

        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}
