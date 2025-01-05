package de.fhdo.Recipedia.service;

import de.fhdo.Recipedia.dto.RecipeDto;

import java.util.List;

public interface RecipeService {
    RecipeDto createRecipe(RecipeDto recipeDto);
    Boolean deleteRecipe(Long recipeId);
    RecipeDto updateRecipe(RecipeDto recipeDto);
    RecipeDto getRecipe(Long recipeId, Long userId);
    List<RecipeDto> getRecipes(String keyword);
    List<RecipeDto> getRecipesByCategory(String category);
    List<RecipeDto> getRecipesByAuthor(Long authorId);
    List<RecipeDto> getRecipesByChallenge(Long challengeId);
    List<RecipeDto> getMostViewedRecipes();
}
