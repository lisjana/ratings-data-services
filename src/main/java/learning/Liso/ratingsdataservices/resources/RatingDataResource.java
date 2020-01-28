package learning.Liso.ratingsdataservices.resources;

import learning.Liso.ratingsdataservices.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingDataResource {

    @RequestMapping("/{movieId}")
    public Rating getRatinginfo(@PathVariable("movieId") String movieId){
        return new Rating(movieId, 4);
    }
}
