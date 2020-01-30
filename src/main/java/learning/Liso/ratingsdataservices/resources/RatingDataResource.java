package learning.Liso.ratingsdataservices.resources;

import learning.Liso.ratingsdataservices.models.Rating;
import learning.Liso.ratingsdataservices.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingDataResource {

    @RequestMapping("/{movieId}")
    public Rating getRatinginfo(@PathVariable("movieId") String movieId){
        return new Rating(movieId, 4);
    }

    @RequestMapping("users/{userId}")
    public UserRating getRatingInfo(@PathVariable("userId") String userId){

        
        List<Rating> ratings = Arrays.asList();
        
        if (userId.equals("1")){
            ratings = Arrays.asList(
                    new Rating("Flutura ne kabinen time", 4),
                    new Rating("Beni ecen vete", 3)
            );
        }
        else if (userId.equals("2")){
            ratings = Arrays.asList(
                    new Rating("Kapedani", 5),
                    new Rating("Zonja nga qyteti", 7)
            );
        }
        else{
            ratings = Arrays.asList();
        }
        
        UserRating userRating = new UserRating();
        userRating.setUserRating(ratings);
        return userRating;
    }
}
