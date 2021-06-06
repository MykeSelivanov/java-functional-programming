package listfunctionaloperations;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Movie {

    private String name;
    private int releaseYear;
    private String industry;

    public Movie(String name, int releaseYear, String industry) {
        this.setName(name);
        this.setReleaseYear(releaseYear);
        this.setIndustry(industry);
    }


}
