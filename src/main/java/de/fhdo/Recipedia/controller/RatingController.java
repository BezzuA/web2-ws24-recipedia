package de.fhdo.Recipedia.controller;

import de.fhdo.Recipedia.dto.RatingDto;
import de.fhdo.Recipedia.service.RatingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ratings")
public class RatingController {
    private final RatingService ratingService;

    public RatingController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @PostMapping(
        produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
        consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public ResponseEntity<RatingDto> createRating(@RequestBody RatingDto ratingDto) {
        RatingDto createdRating = ratingService.createRating(ratingDto);
        if (createdRating != null) {
            return new ResponseEntity<>(createdRating, HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}